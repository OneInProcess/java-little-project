package c04.h03;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// 构造一个 AgeCheck类，实现AgeCheckInterface接口，
		// 当checkAge中的参数<0或者>200的时候抛出异常，
		// 注意，不许对AgeCheckInterface做任何修改
		//交作业的时候 AgeCheckInterface 也一并交上来
		AgeCheckInterface ageCheck = new AgeCheck();
		ageCheck.checkAge(10);
		// 做对了 第一步
		try {
			ageCheck.checkAge(-10);
		} catch (Exception e) {
			// 做对了第二步
			System.out.println("ok");
		}
	}

}
