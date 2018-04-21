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
		// 此题不需要考虑大小写
		if (util.isSymmetricalStr("abccba") && util.isSymmetricalStr("abccba")
				&& (!util.isSymmetricalStr("abcd"))) {
			// 做对了
		}

		// 此题不需要考虑大小写
		if (util.containsDigital("abc12a") && util.containsDigital("1234")
				&& (!util.containsDigital("abcd"))) {
			// 做对了
			
		}

		// 此题不需要考虑大小写
		if (util.getFileExtName("abc.jpeg").equals("jpeg")
				&& (util.getFileExtName("abc.1234.pdf").equals("pdf"))) {
			// 做对了
			
		}

		if (util.isEmpty("  ") && (util.isEmpty("  \r\n"))
				&& (!util.isEmpty(" wang  "))) {
			// 做对了
	
		}
		
		StringBuffer buf=new StringBuffer("123abc123Abc456abc");
		util.replace(buf, "abc", "zzz");
		if (buf.toString().equals("123zzz123Abc456zzz")) {
			// 做对了
			System.out.print("1s2");
		}
		
		if (util.getHighestFrequency("abcdABCDabcdaBCD")=='a'){
			// 做对了
			System.out.print("12");
		}
	}
}
