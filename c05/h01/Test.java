package c05.h01;

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
		// TODO Auto-generated method stub
		StrUtil util = new StrUtil();
		// ���ⲻ��Ҫ���Ǵ�Сд
		if (util.isSymmetricalStr("abccba") && util.isSymmetricalStr("abccba")
				&& (!util.isSymmetricalStr("abcd"))) {
			// ������
		}

		// ���ⲻ��Ҫ���Ǵ�Сд
		if (util.containsDigital("abc12a") && util.containsDigital("1234")
				&& (!util.containsDigital("abcd"))) {
			// ������
			
		}

		// ���ⲻ��Ҫ���Ǵ�Сд
		if (util.getFileExtName("abc.jpeg").equals("jpeg")
				&& (util.getFileExtName("abc.1234.pdf").equals("pdf"))) {
			// ������
			
		}

		if (util.isEmpty("  ") && (util.isEmpty("  \r\n"))
				&& (!util.isEmpty(" wang  "))) {
			// ������
	
		}
		
		StringBuffer buf=new StringBuffer("123abc123Abc456abc");
		util.replace(buf, "abc", "zzz");
		if (buf.toString().equals("123zzz123Abc456zzz")) {
			// ������
			System.out.print("1s2");
		}
		
		if (util.getHighestFrequency("abcdABCDabcdaBCD")=='a'){
			// ������
			System.out.print("12");
		}
	}
}
