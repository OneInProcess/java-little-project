package q12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream;

import org.omg.CORBA_2_3.portable.OutputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			convert(new File("D:/test/gbk.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void convertAll(File root) throws IOException {
		if (root.isFile()) {
			String name = root.getName();
			if (name.endsWith(".txt")) {
				convert(root);
			}
		} else if (root.isDirectory()) {
			File[] files = root.listFiles();
			for (int i = 0; i < files.length; i++) {
				convertAll(files[i]);
			}
		}
	}

	public static void convert(File file) throws IOException {
		InputStream in = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		int len = in.read(data);
		in.close();
		String gbk = new String(data, 0, len, "gbk");
		byte[] dataUtf8 = gbk.getBytes("utf-8");
		FileOutputStream out = new FileOutputStream(file);
		out.write(dataUtf8);
		out.flush();
		out.close();
	}

}
