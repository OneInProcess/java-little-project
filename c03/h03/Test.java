/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
package c03.h03;

//import a03.h03.Dog;

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
		// 完成Dog类

		Dog dog = new Dog();
		if (dog.getName().equals("none")) {
			// 做对了
		}
		
		dog = new Dog("haha");
		if (dog.getName().equals("haha")) {
			// 做对了
		}
		
		dog = new Dog("haha","black");
		if (dog.getName().equals("haha")&&dog.getColor().equals("black")) {
			System.out.println("yes");// 做对了
		}
	}

}
