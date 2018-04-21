/**
 * 
 */
package c08.h01;

import java.util.List;

/**
 * @author Administrator
 * 
 */
public class Test {

	public static void main(String[] args) {

		try {
			C08DataUtil dataUtil = new C08DataUtil();
			// 作业1 完成C08DataUtil.getFrequentItem 类
			String result;

			result = dataUtil
					.getFrequentItem("D:/course/home_work/src/c08/h01/detail.txt");

			if (result.equals("啤酒,炸鸡") || result.equals("炸鸡,啤酒")) {
				// 做对了
			}

			C08FileUtil fileUtil = new C08FileUtil();
			// 作业2 完成C08FileUtil.listAllFiles 方法
			List<String> files = fileUtil.listAllFiles(
					"D:/course/home_work/src/c08/", EnumField.file_name,
					EnumListOrder.asc);
			for (int i = 0; i < files.size(); i++) {
				System.out.println(files.get(i));
			}
			if (files.size() == 6 && files.get(0).equals("C08DataUtil.java")
					&& files.get(1).equals("C08FileUtil.java")
					&& files.get(2).equals("detail.txt")
					&& files.get(3).equals("EnumField.java")
					&& files.get(4).equals("EnumListOrder.java")
					&& files.get(5).equals("Test.java")) {
				System.out.print("a");
				// 做对了
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
