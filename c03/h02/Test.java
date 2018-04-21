/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package c03.h02;

//import a03.h02.*;



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
		// 定义Human类, TjuStudent类,Student接口,Youth接口
		// 为上述几个类、接口定义合适的关系
		// 为每个类、接口定义实现合适的方法

		Human h = new TjuStudent("tom");
		if (h.getName().equals("tom")) {
			//做对了
		}

		TjuStudent tjus = (TjuStudent) h;
		Student s = tjus;
		if (s.study().equals("I study")) {
			//做对了
		}


		Youth y = tjus;
		y.setAge(23);
		if (y.getAge() == 23) {
			//做对了
		}

		if (!(new Human() instanceof Student)) {
			//做对了
		}

		if (!(new Human() instanceof Youth)) {
			System.out.println("ss");//做对了
		}


	}

}
