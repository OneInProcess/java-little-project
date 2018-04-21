package c04.h02;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 完成TypeValidator 类，尤其是该类的 validate方法

		TypeValidator v=new TypeValidator();
		
		//validate方法支持任何一个对象做参数
		//评作业时候可能是除了String以为任何类型
//		v.validate(new Integer(1));
//		v.validate(new Boolean(false));
		System.out.print("1");
		//做对了 第1步
		try{
			v.validate(new Integer(1));
			v.validate(new Boolean(false));
			//如果是String类型，则抛异常
//			v.validate("abc");
		}catch(Exception e){
			if(e.getMessage().equals("String is not a valid type!")){
				//做对了 第2步
				System.out.print("1");
			}
		}
		

	}

}
