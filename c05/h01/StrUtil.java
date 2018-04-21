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
	 * �ж�src�ַ����Ƿ��ǶԳ��ַ�����Ҳ��������ַ�����������ַ��������򣨲��ؿ��Ǵ�Сд���⣩
	 * ���� a/ aba / aaaa / abccba ���ǶԳ��ַ���
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
	 * �ж�src�ַ��������Ƿ������֣�0-9)������з���true�����򷵻�false
	 * ���� containsDigital("a1ads")=true 
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
	 * ȡ��һ���ļ�������չ����Ҳ�������һ�� . ��Ĳ��֣�
	 * ���磺
	 * getFileExtName("1.txt") ���� txt
	 * getFileExtName("a.b.doc") ���� doc
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
	 * �ж�һ���ַ����Ƿ�Ϊ��  �������ַ���==null���� trim()�󳤶�Ϊ0  �򷵻�false ������ true
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
	 * ��buf�г��ֵ�src�ַ�ͳͳ�滻Ϊtarget�ַ������ؿ��Ǵ�Сд�������
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
	 * src����a-z A-Z ��ɵģ��ҳ����г���Ƶ����ߵ��ַ�(��Сд��Ϊ������ͬ���ַ�),��������ַ�����Ƶ����ͬ���򷵻� ansi��С���Ǹ���ĸ
	 * ���磺 getHighestFrequency("aAaabbBBcd")='a'
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
