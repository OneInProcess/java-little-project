package c04.h03;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// ����һ�� AgeCheck�࣬ʵ��AgeCheckInterface�ӿڣ�
		// ��checkAge�еĲ���<0����>200��ʱ���׳��쳣��
		// ע�⣬�����AgeCheckInterface���κ��޸�
		//����ҵ��ʱ�� AgeCheckInterface Ҳһ��������
		AgeCheckInterface ageCheck = new AgeCheck();
		ageCheck.checkAge(10);
		// ������ ��һ��
		try {
			ageCheck.checkAge(-10);
		} catch (Exception e) {
			// �����˵ڶ���
			System.out.println("ok");
		}
	}

}
