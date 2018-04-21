package c11.h01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileUtil {

	/**
	 * 比较两个java文件之间的相似性，相似度介于0-1之间，1表示完全相同，0 表示完全不同
	 * 提示 
	 * 1  读取两个文件，每个文件放到一个List<String>中
	 * 2 格式化List<String>中每一行，去掉空格 \t ,去掉注释行 （以 //开头）（以 *  /*开头也近似认为是一行 )
	 * 3 比较两个List逐行之间相似度
	 * @param srcFile
	 * @param targetFile
	 * @return
	 */
	public double getSimilarity(String srcFile, String targetFile) throws IOException{

		FileReader reader1=new FileReader(srcFile);
		FileReader reader2=new FileReader(targetFile);
		LineNumberReader lineNumberReader1= new LineNumberReader(reader1);
		LineNumberReader lineNumberReader2= new LineNumberReader(reader2);
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		list1.add(lineNumberReader1.readLine());
		int i=0;
		while (list1.get(i)!=null){
			i++;
			list1.add(lineNumberReader1.readLine());
		}
		list2.add(lineNumberReader2.readLine());
		int j=0;
		while (list2.get(j)!=null){
			j++;
			list2.add(lineNumberReader2.readLine());
		}
		List<String> list11=new ArrayList<>();
		List<String> list22=new ArrayList<>();
		deletes(list1,list11);
		deletes(list2,list22);
//		for(int a=0;a<list1.size();a++){
//			System.out.println(list1.get(a));
//		}
		double results=comapares(list11,list22);



		return results;
	}
	public void deletes(List<String> l1,List<String> l2){
		int j;
		l1.remove(l1.size()-1);
		for(int i=0;i<l1.size();i++){
			j=l1.get(i).trim().length();
			if(j<1){
				l1.remove(i);
				i=i-1;
			}
		}
		for(int i=0;i<l1.size();i++){
			l2.add(l1.get(i).trim());
		}

		for(int i=0;i<l2.size();i++){
			if(l2.get(i).indexOf('*')>-1){
				l2.remove(i);
				i=i-1;
			}
		}
//		for(int i=0;i<l2.size();i++){
//			System.out.println(l2.get(i));
//		}
	}
	public double comapares(List<String> l11,List<String> l22){
		int leng;
		if(l11.size()-l22.size()>=0){
			leng=l22.size();
		}
		else {
			leng=l11.size();
		}
		double[] sim=new double[leng];
		double sum=0;
		double result;
		int j,k;
		String str1,str2;
		for(int i=0;i<leng;i++){
			if(l11.get(i).length()>=l22.get(i).length()){
				j=l22.get(i).length();
			}else {
				j=l11.get(i).length();
			}
			k=0;
			str1=l11.get(i);
			str2=l22.get(i);
			for(int a=0;a<j;a++){
				if(str1.substring(a,a+1).equals(str2.substring(a,a+1))){
					k++;
				}
			}
			sim[i]=k/j;
		}
		for(int i=0;i<leng;i++){
			sum=sum+sim[i];
		}
		result=sum/leng;
		return result;
	}
}
