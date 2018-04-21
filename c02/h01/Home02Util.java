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
	 * 作业c02.h01.1
	 * 判断a,b,c是否能够构成三角形的三个边
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
	 * 判断两个浮点数是否相等，一般认为如果两个浮点数的差值小于0.0001，即认为相等
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
	 * 将学生百分之成绩变换为A(>=90,B>=80且非A,C>=70且非C,D>=60且非D,E 其他)
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
	 * 判断一个数字是否是质数，如果是质数返回true，否则false
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