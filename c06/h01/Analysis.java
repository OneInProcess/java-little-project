package c06.h01;


/**
 * 类中目前仅有一个方法，同学们可以根据实际需要增加方法，甚至增加类，但是增加的类必须和Analysis 处在同一个目录
 * @author Administrator
 *
 */
public class Analysis {
	/**
	 * content内容 见red.txt 该函数要做如下工作 
	 * 1 根据第x回 (第一回 ..第一二零回) 将文本拆分成 120段 
	 * 2 统计每段里面出现字符c的频率 
	 * 3 把每回出现c的频率放到数组里面 
	 * 4 不需要考虑文件中的一些干扰字符 例如： 手机电子书·大学生小说网
	 * 更新时间:2006-7-26 11:43:00 本章字数:8717 [红楼梦 / 曹雪芹 著 ]
	 * 手机电子书·大学生小说网Txt版阅读,阅读作品更多请访问:http://www.dxsxs.com，
	 * 书籍介绍: 中国古代四大名著之一....
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
		cap[1]="一";cap[2]="二";cap[3]="三";cap[4]="四";cap[5]="五";cap[6]="六";cap[10]="十";cap[7]="七";cap[8]="八";cap[9]="九";cap[0]="零";
		for(i=11;i<20;i++){
			cap[i]="十"+cap[i-10];
		}
		for(i=2;i<10;i++){
			cap[i*10]=cap[i]+"十";
		}
		for(i=2;i<10;i++){
			for(j=1;j<10;j++){
				cap[i*10+j]=cap[i]+"十"+cap[j];
			}
		}
		cap[100]="一零零";cap[120]="一二零";
		for(i=1;i<10;i++){
			cap[100+i]="一零"+cap[i];
		}
		for(i=0;i<10;i++){
			cap[110+i]="一一"+cap[i];
		}
		for(i=1;i<121;i++){
			loc[i]=content.indexOf("第"+cap[i]+"回");
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
