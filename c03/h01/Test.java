/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 */
/**
 * 
 */
package c03.h01;

//import a03.h01.Student;



/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//完成本包下面Student类（增加适当的方法、属性）
		//是的下面程序能够正确运行
		Student s1=new Student("tom");
		Student s2=new Student("jack");
		String s;
		
		if(s1.getName().equals("tom")){
			//做对了
		}
		
		if(s2.getName().equals("jack")){
			//做对了
		}
		
		s1.setPid("123");
		s2.setPid("456");
		if(!s1.equals(s2)){
			//做对了
		}
		
		s2.setPid(s1.getPid());
		if(s1.equals(s2)){
			//做对了
		}
		
		
		String str=String.valueOf(s1);
		if(str.equals("name=tom pid=123")){
			//做对了
		}
		

	}
}

