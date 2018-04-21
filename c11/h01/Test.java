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
			 *  作业1 实现ReflectUtil, 根据xml配置文件，读取数据，根据读取到的数据实例化对象，并且给对象属性
//			 */
			ReflectUtil util = new ReflectUtil();
			Car car=(Car)util.createObjectByConfig("D:/course/home_work/src/c11/h01/config.xml");
			if("red".equals(car.getColor())&&"abc".equals(car.getId())){
				System.out.println("做对了!");
			}

			/**
			 *  作业2 实现FileUtil, 判断两个.java程序文件相似度（应该去掉注释 空行 空格等）
			 *  批作业时候，可能给两个不同文件名 但是文件内容完全相同，此时要求相似度>0.9
			 *  也可能给两个内容截然不同的文件,此时要求相似度<0.5
			 *  相似度介于0-1之间
			 */
			FileUtil  fileUtil = new FileUtil();			
			double sim=fileUtil.getSimilarity("D:/course/home_work/src/c11/h01/ReflectUtil.java","D:/course/home_work/src/c11/h01/ReflectUtil.java");
			if(sim>0.9){
				System.out.println("做对了!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
