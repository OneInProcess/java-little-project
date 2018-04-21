package q04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<1000;i++){
			String s=String.valueOf(i);
			int a1=Integer.parseInt(String.valueOf(s.charAt(0)));
			int a2=Integer.parseInt(String.valueOf(s.charAt(1)));
			int a3=Integer.parseInt(String.valueOf(s.charAt(2)));
			int sum=(int)(Math.pow(a1, 3)+Math.pow(a2, 3)+Math.pow(a3, 3));
			if(i==sum){
				System.out.println(i);
			}
		}

	}

}
