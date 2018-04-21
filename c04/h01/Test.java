package c04.h01;



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
		// 完成Dog 类
		Dog dog=new Dog();
		
		
		try{
			//Dog最多只能调用feed()3次 第4次抛异常
			//
			dog.feed();
			dog.feed();
			dog.feed();
			//做对了第1步
			//狗要撑死了
			dog.feed();
		}catch(Exception e){
			if(e.getMessage().equals("I can not eat more!")){
				System.out.println("as");
				//做对了第2步
			}
		}
	

	}
}
