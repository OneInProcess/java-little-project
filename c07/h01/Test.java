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
		
		//��ҵ1 ���ListSetMapUtil.uion����
		Set set=util.union(set1,set2);
		if(set.size()==4){
			System.out.println("s");//������
		}
		
		//��ҵ2 ���ListSetMapUtil.diff����
		set=util.diff(set1, set2);
		if(set.size()==1){
			System.out.println("s");//������
		}
	
		//��ҵ3 ��Student���������ʵ��ķ���
		//ʹ��set����Ϊѧ����ͬ��ѧ�� ����ͬһ��ѧ��
		TreeSet tset=new TreeSet();

		tset.add(new Student("3015215888","liming"));
		tset.add(new Student("3015215666","wangli"));
		tset.add(new Student("3015215888","liwei"));
		tset.add(new Student("3015215555","liwei"));
		tset.add(new Student("3015215222","liwei"));
		if(tset.size()==4){
			System.out.println("s");//������
		}

		//��ҵ4��Student���������ʵ��ķ�����ʹ�������ʱ�򣬰�ѧ����С��������
		Student[] stus=(Student[])tset.toArray(new Student[0]);
		if(stus[0].getId().equals("3015215222")){
			//������
			System.out.println("s");
		}


		//��ҵ5  ���StrStat�࣬ʹ���ܹ�ͳ��һ�仰�� �����ַ����ֵĴ���		
		StrStat stat=new StrStat("�����������");
		
		if(stat.stat('��')==2&&stat.stat('��')==1){
			System.out.println("s");//������
		}
		
		
	}

}
