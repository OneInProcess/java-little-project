package c06.h01;


/**
 * ����Ŀǰ����һ��������ͬѧ�ǿ��Ը���ʵ����Ҫ���ӷ��������������࣬�������ӵ�������Analysis ����ͬһ��Ŀ¼
 * @author Administrator
 *
 */
public class Analysis {
	/**
	 * content���� ��red.txt �ú���Ҫ�����¹��� 
	 * 1 ���ݵ�x�� (��һ�� ..��һ�����) ���ı���ֳ� 120�� 
	 * 2 ͳ��ÿ����������ַ�c��Ƶ�� 
	 * 3 ��ÿ�س���c��Ƶ�ʷŵ��������� 
	 * 4 ����Ҫ�����ļ��е�һЩ�����ַ� ���磺 �ֻ������顤��ѧ��С˵��
	 * ����ʱ��:2006-7-26 11:43:00 ��������:8717 [��¥�� / ��ѩ�� �� ]
	 * �ֻ������顤��ѧ��С˵��Txt���Ķ�,�Ķ���Ʒ���������:http://www.dxsxs.com��
	 * �鼮����: �й��Ŵ��Ĵ�����֮һ....
	 * 
	 * @param content
	 * @param c
	 * @return
	 */
	public int[] analysisRed(String content, char c) {
		String in[]=new String[121] ;
		String cap[]=new String[121];
		int loc[]=new int[121];
		int i,j;
		cap[1]="һ";cap[2]="��";cap[3]="��";cap[4]="��";cap[5]="��";cap[6]="��";cap[10]="ʮ";cap[7]="��";cap[8]="��";cap[9]="��";cap[0]="��";
		for(i=11;i<20;i++){
			cap[i]="ʮ"+cap[i-10];
		}
		for(i=2;i<10;i++){
			cap[i*10]=cap[i]+"ʮ";
		}
		for(i=2;i<10;i++){
			for(j=1;j<10;j++){
				cap[i*10+j]=cap[i]+"ʮ"+cap[j];
			}
		}
		cap[100]="һ����";cap[120]="һ����";
		for(i=1;i<10;i++){
			cap[100+i]="һ��"+cap[i];
		}
		for(i=0;i<10;i++){
			cap[110+i]="һһ"+cap[i];
		}
		for(i=1;i<121;i++){
			loc[i]=content.indexOf("��"+cap[i]+"��");
		}
		for(i=1;i<120;i++){
			in[i]=content.substring(loc[i], loc[i+1]);
		}
		in[120]=content.substring(loc[120]);
		
		
		int math[]=new int[120];
		for(i=0;i<120;i++){
			int len=in[i+1].length();
			for(j=1;j<len-1;j++){
				if(c==in[i+1].charAt(j)){
				   math[i]=math[i]+1;
				}
			}
		}
		return math;
	}

}
