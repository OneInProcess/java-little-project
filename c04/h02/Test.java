package c04.h02;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// ���TypeValidator �࣬�����Ǹ���� validate����

		TypeValidator v=new TypeValidator();
		
		//validate����֧���κ�һ������������
		//����ҵʱ������ǳ���String��Ϊ�κ�����
//		v.validate(new Integer(1));
//		v.validate(new Boolean(false));
		System.out.print("1");
		//������ ��1��
		try{
			v.validate(new Integer(1));
			v.validate(new Boolean(false));
			//�����String���ͣ������쳣
//			v.validate("abc");
		}catch(Exception e){
			if(e.getMessage().equals("String is not a valid type!")){
				//������ ��2��
				System.out.print("1");
			}
		}
		

	}

}
