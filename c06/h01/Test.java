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
			//��¥������ļ���ŵ�λ�� ͬѧ��ʵ��ʱ����Ҫ����ʵ����� �����ļ���
			//ע�⣺��Ҫ��Eclipse�в鿴red.txt�����õ͵ĵ��Կ�������
			String filename="D:/course/home_work/src/c06/red.txt";
			//��ȡ������ļ�������  ����ҵʱ�򣬺�¥���ı����ݿ��ܻ����е���
			content = readFile(filename);
			//ʵ�ʲ���ʱ�򣬿���Ҫ��ͳ�Ʋ�ͬ���ַ� ���� '��' '��'...
			int[] counts=new Analysis().analysisRed(content, '֮');
			for(int i=0;i<counts.length;i++){
				System.out.println(counts[i]);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	/**
	 * ��Ӳ���϶�ȡһ���ı��ļ�����ת��Ϊ�ַ������أ���GBK���뷽ʽ���أ�
	 * ���ļ���Сһ�㲻Ҫ����10M 
	 * @param filename �ļ���  ���� D:/course/home_work/src/c06/red.txt 
	 * @return �������ı��ļ����� 
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
				throw new IllegalArgumentException("��ȡ�ļ�ʧ�ܣ�ָ���ļ�" + filename
						+ "�����ڡ�");
			}
			if (src.isDirectory()) {
				throw new IllegalArgumentException("��ȡ�ļ�ʧ�ܣ�" + filename
						+ "��Ŀ¼�������ļ���");
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
