package c07.h01;

public class StrStat {
String str1;
	public StrStat(String str){
		this.str1=str;
	}
	/**
	 * �����ַ���c��str�г��ֵĴ���
	 * @param c
	 * @return
	 */
	public int stat(char c){
		int i,len,sum;
		len=str1.length();
		sum=0;
		for(i=0;i<len;i++){
			if(str1.charAt(i)==c){
				sum+=1;
			}
		}
		
		return sum;
	}
}
