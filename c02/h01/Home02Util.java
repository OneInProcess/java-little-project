/**
 * 
 */
package c02.h01;

/**
 * @author Administrator
 *
 */
public class Home02Util {

	/**
	 * 
	 */
	public Home02Util() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ҵc02.h01.1
	 * �ж�a,b,c�Ƿ��ܹ����������ε�������
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public boolean isTriangle(int a, int b, int c) {
		if (a > 0 & b > 0 & c > 0) {
			if (a + b > c & a + c > b & b + c > a) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	/**
	 * �ж������������Ƿ���ȣ�һ����Ϊ��������������Ĳ�ֵС��0.0001������Ϊ���
	 * @param f1
	 * @param f2
	 * @return
	 */
	public boolean isEq(float f1, float f2) {
		double x1 = 0.0001;
		if (-x1 < f1 - f2 & f1 - f2 < x1) {
			return true;
		} else
			return false;
	}
	
	/**
	 * ��ѧ���ٷ�֮�ɼ��任ΪA(>=90,B>=80�ҷ�A,C>=70�ҷ�C,D>=60�ҷ�D,E ����)
	 * @param score
	 * @return
	 */
	public String getGrade(int score) {
		if (score >= 90)
			return "A";
		else if (score >= 80)
			return "B";
		else if (score >= 70)
			return "C";
		else if (score >= 60)
			return "D";
		else
			return "E";
	}

	/**
	 * �ж�һ�������Ƿ����������������������true������false
	 * @param i
	 * @return
	 */
	public boolean isPrime(int i) {
		int j = 2;
		double x = 0;
		while (j < i) {
			x = i % j;
			if (x == 0)
				return false;
			j = j + 1;
		}

		return true;
	}
}