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
			// ��ҵ1 ���C08DataUtil.getFrequentItem ��
			String result;

			result = dataUtil
					.getFrequentItem("D:/course/home_work/src/c08/h01/detail.txt");

			if (result.equals("ơ��,ը��") || result.equals("ը��,ơ��")) {
				// ������
			}

			C08FileUtil fileUtil = new C08FileUtil();
			// ��ҵ2 ���C08FileUtil.listAllFiles ����
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
				// ������
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
