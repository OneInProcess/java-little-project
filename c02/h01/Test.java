/**
 * 
 */
package c02.h01;

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
		// 完成Home02Util类中的isTriangle  isEq getGrade isPrime四个方法
		if (new Home02Util().isTriangle(2, 4, 3)) {
			//做对了
		}

		if (new Home02Util().isEq(0.0002f, 0.001f + 0.001f)) {
			//做对了
		}
		
		if (new Home02Util().getGrade(95).equals("A")) {
			//做对了
		}
		if (new Home02Util().isPrime(13)) {
			//做对了
		}
		
	}

}
