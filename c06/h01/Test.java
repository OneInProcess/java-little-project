package c06.h01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String content;
		try {
			//红楼梦这个文件存放的位置 同学们实验时候需要根据实际情况 调整文件名
			//注意：不要在Eclipse中查看red.txt，配置低的电脑可能死机
			String filename="D:/course/home_work/src/c06/red.txt";
			//读取到这个文件的内容  判作业时候，红楼梦文本内容可能会略有调整
			content = readFile(filename);
			//实际测试时候，可能要求统计不同的字符 例如 '了' '贾'...
			int[] counts=new Analysis().analysisRed(content, '之');
			for(int i=0;i<counts.length;i++){
				System.out.println(counts[i]);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	/**
	 * 从硬盘上读取一个文本文件，并转换为字符串返回（以GBK编码方式返回）
	 * 该文件大小一般不要超过10M 
	 * @param filename 文件名  例如 D:/course/home_work/src/c06/red.txt 
	 * @return 读到的文本文件内容 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String readFile(String filename) throws FileNotFoundException, IOException {
		 
		File src = null;
		int totalReaded = 0;
		int readed = 0;
		FileInputStream reader = null;
		byte data[];
		try {
			src = new File(filename);
			if (!src.exists()) {
				throw new IllegalArgumentException("读取文件失败：指定文件" + filename
						+ "不存在。");
			}
			if (src.isDirectory()) {
				throw new IllegalArgumentException("读取文件失败：" + filename
						+ "是目录而不是文件。");
			}

			Long len = src.length();

			data = new byte[len.intValue()];
			for (reader = new FileInputStream(filename); reader.available() > 0;) {
				readed = reader.read(data, totalReaded,
						(len.intValue() - totalReaded));
				totalReaded += readed;
			}
			return new String(data, "GBK");
		} finally {

			if (reader != null) {
				reader.close();
			}

		}

	}

}
