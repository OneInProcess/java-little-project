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
		 * ��ҵ1  ���̷߳�ʽ������ĳ���������е���������С����
		 */
		List<Long> list = util.getPrimeList(4, 25);
		if (list.get(0) == 5 &&
				list.get(1) == 7) {
			System.out.print("������");//������
		}
		//��ҵ2ȡ����ԭ���Ƿ������������

	}
}


