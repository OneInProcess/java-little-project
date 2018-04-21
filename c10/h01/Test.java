/**
 *
 */
package c10.h01;

import java.util.List;


/**
 * @author Administrator
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeUtil util = new PrimeUtil();
		/**
		 * 作业1  多线程方式，返回某个区间所有的质数，由小到大
		 */
		List<Long> list = util.getPrimeList(4, 25);
		if (list.get(0) == 5 &&
				list.get(1) == 7) {
			System.out.print("做对了");//做对了
		}
		//作业2取消（原来是返回最大质数）

	}
}


