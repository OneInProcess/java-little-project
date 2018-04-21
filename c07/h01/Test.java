package c07.h01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListSetMapUtil util=new ListSetMapUtil();
		Set set1=new HashSet();
		Set set2=new HashSet();
		
		set1.add("a");
		set1.add("b");
		set1.add("c");
		
		set2.add("a");
		set2.add("b");
		set2.add("d");
		
		//作业1 完成ListSetMapUtil.uion函数
		Set set=util.union(set1,set2);
		if(set.size()==4){
			System.out.println("s");//做对了
		}
		
		//作业2 完成ListSetMapUtil.diff函数
		set=util.diff(set1, set2);
		if(set.size()==1){
			System.out.println("s");//做对了
		}
	
		//作业3 给Student类中增加适当的方法
		//使得set中认为学号相同的学生 就是同一个学生
		TreeSet tset=new TreeSet();

		tset.add(new Student("3015215888","liming"));
		tset.add(new Student("3015215666","wangli"));
		tset.add(new Student("3015215888","liwei"));
		tset.add(new Student("3015215555","liwei"));
		tset.add(new Student("3015215222","liwei"));
		if(tset.size()==4){
			System.out.println("s");//做对了
		}

		//作业4给Student类中增加适当的方法，使得排序的时候，按学号由小到大排序
		Student[] stus=(Student[])tset.toArray(new Student[0]);
		if(stus[0].getId().equals("3015215222")){
			//做对了
			System.out.println("s");
		}


		//作业5  完成StrStat类，使其能够统计一句话中 任意字符出现的次数		
		StrStat stat=new StrStat("今天的天气好");
		
		if(stat.stat('天')==2&&stat.stat('今')==1){
			System.out.println("s");//做对了
		}
		
		
	}

}
