package c05.h01;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StrUtil {

	public StrUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 判断src字符串是否是对称字符串，也就是这个字符串等于这个字符串的逆序（不必考虑大小写问题）
	 * 例如 a/ aba / aaaa / abccba 都是对称字符串
	 * @param src
	 * @return
	 */
	public boolean isSymmetricalStr(String src){
		int len=src.length();
		boolean a=false;
		for(int i=0;i<len-1; i++){
			if( src.substring(i, i+1).equals(src.substring(len-i-1, len-i))){
				a=true;
			}
				else{
					a=false;
				}
			}
	return a;	
	}

	/**
	 * 判断src字符串里面是否有数字（0-9)，如果有返回true，否则返回false
	 * 例如 containsDigital("a1ads")=true 
	 * containsDigital("abcde")=false
	 * @param src
	 * @return
	 */
	public boolean containsDigital(String src){
		int len=src.length(),i;
		char[] s=src.toCharArray();
		boolean a=false;
		for(i=0;i<len-1;i++){
			if(Character.isDigit(s[i])){
				a=true;
			}
		}
		return a;
	}
	
	/**
	 * 取得一个文件名的扩展名（也就是最后一个 . 后的部分）
	 * 例如：
	 * getFileExtName("1.txt") 返回 txt
	 * getFileExtName("a.b.doc") 返回 doc
	 * @param filename
	 * @return
	 */
	public String getFileExtName(String filename){
		int s=filename.lastIndexOf(".");
		int len=filename.length();
		String a="";
		if(s<len-1&&s>0){
			a=filename.substring(s+1);
		}
		return a;
	}
	
	/**
	 * 判断一个字符串是否为空  如果这个字符串==null或者 trim()后长度为0  则返回false ，否则 true
	 * @param s
	 * @return
	 */
	public boolean isEmpty(String s){
		if( s==null||s.trim().length()==0){
			return true;
		}
		else
			
			return false;
	}
	
	/**
	 * 将buf中出现的src字符统统替换为target字符（不必考虑大小写的情况）
	 * @param buf
	 * @param src
	 * @param target
	 */
	public void replace(StringBuffer buf,String src,String target){
//		int len=buf.length(),i;
//		int b=src.length();
//		for(i=1;i<len;i++){
//			int a=buf.indexOf(src);
//			if(a>0){
//				buf.delete(a, a+b);
//				buf.insert(a, target);
//			}
//		}
		String a=buf.toString();
		a=a.replace(src,target);
		buf.delete(0,buf.length());
		buf.append(a);
	}
	
	/**
	 * src是由a-z A-Z 组成的，找出其中出现频率最高的字符(大小写视为两个不同的字符),如果两个字符出现频率相同，则返回 ansi最小的那个字母
	 * 例如： getHighestFrequency("aAaabbBBcd")='a'
	 * getHighestFrequency("sssbbbcccaf")='b'
	 * @param src
	 * @return
	 */
	public char getHighestFrequency(String src) {
		Map<Character,Integer> map=new HashMap<>();
		char[] chars=src.toCharArray();
		int length=chars.length;
		for(int i=0;i<length;i++){
			if(!map.containsValue(chars[i])){
				map.put(chars[i],1);
			}
			else{
				map.put(chars[i],map.get(chars[i])+1);
			}
		}
		int temp=0;
		for (int i=0;i<map.size();i++){
			if(map.get(chars[i])>temp){
				temp=map.get(chars[i]);
			}
		}
		int x=0;
		for (int i=0;i<map.size();i++){
			if(map.get(chars[i])==temp){
				x=i;
				break;
			}
		}


		return chars[x];
	}
		//		int len=src.length(),i,sum1=1,sum2=1,n=0;
//		char s[]=src.toCharArray();
//		Arrays.sort(s);
//		for(i=0;i<len-1;i++){
//			if(s[i]==s[i+1]){
//			sum1=sum1+1;
//			}
//			else{
//				if(sum2>=sum1){
//					sum1=1;
//
//				}
//				else{
//					sum2=sum1;
//				    n=i;
//				sum1=1;}
//			}
//
//
//		}
//	return s[n];
//	}

}
