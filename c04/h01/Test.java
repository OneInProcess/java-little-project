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
		// ���Dog ��
		Dog dog=new Dog();
		
		
		try{
			//Dog���ֻ�ܵ���feed()3�� ��4�����쳣
			//
			dog.feed();
			dog.feed();
			dog.feed();
			//�����˵�1��
			//��Ҫ������
			dog.feed();
		}catch(Exception e){
			if(e.getMessage().equals("I can not eat more!")){
				System.out.println("as");
				//�����˵�2��
			}
		}
	

	}
}
