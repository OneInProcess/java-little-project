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
		// ����Parent�࣬Child�࣬Child��Parent����
		// ����ΪParent,Child������ʵķ�����ʹ�������жϳ���
		Parent p=new Parent();
		Child c=new Child();
		if((c instanceof Parent)){
			//������
		}
		if(p.speak().equals("parent")){
			//������
		}
		if(c.speak().equals("child")){
			//������
		}
		
		p=new Parent("jack");
		if(p.getName().equals("jack")){
			System.out.print(" 2");
			//������
		}
		
		c=new Child("tom");
			if(c.getName().equals("tom")){
				//������
			}

			if(c.getParentName().equals("tom's father")){
			//������
		}
	}

}
