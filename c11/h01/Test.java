/**
 * 
 */
package c11.h01;

/**
 * @author Administrator
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			/**
			 *  ��ҵ1 ʵ��ReflectUtil, ����xml�����ļ�����ȡ���ݣ����ݶ�ȡ��������ʵ�������󣬲��Ҹ���������
//			 */
			ReflectUtil util = new ReflectUtil();
			Car car=(Car)util.createObjectByConfig("D:/course/home_work/src/c11/h01/config.xml");
			if("red".equals(car.getColor())&&"abc".equals(car.getId())){
				System.out.println("������!");
			}

			/**
			 *  ��ҵ2 ʵ��FileUtil, �ж�����.java�����ļ����ƶȣ�Ӧ��ȥ��ע�� ���� �ո�ȣ�
			 *  ����ҵʱ�򣬿��ܸ�������ͬ�ļ��� �����ļ�������ȫ��ͬ����ʱҪ�����ƶ�>0.9
			 *  Ҳ���ܸ��������ݽ�Ȼ��ͬ���ļ�,��ʱҪ�����ƶ�<0.5
			 *  ���ƶȽ���0-1֮��
			 */
			FileUtil  fileUtil = new FileUtil();			
			double sim=fileUtil.getSimilarity("D:/course/home_work/src/c11/h01/ReflectUtil.java","D:/course/home_work/src/c11/h01/ReflectUtil.java");
			if(sim>0.9){
				System.out.println("������!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
