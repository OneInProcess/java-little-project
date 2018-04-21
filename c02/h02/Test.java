/**
 * 
 */
package c02.h02;

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
		// 定义Parent类，Child类，Child是Parent子类
		// 并且为Parent,Child定义合适的方法，使得下面判断成立
		Parent p=new Parent();
		Child c=new Child();
		if((c instanceof Parent)){
			//做对了
		}
		if(p.speak().equals("parent")){
			//做对了
		}
		if(c.speak().equals("child")){
			//做对了
		}
		
		p=new Parent("jack");
		if(p.getName().equals("jack")){
			System.out.print(" 2");
			//做对了
		}
		
		c=new Child("tom");
			if(c.getName().equals("tom")){
				//做对了
			}

			if(c.getParentName().equals("tom's father")){
			//做对了
		}
	}

}
