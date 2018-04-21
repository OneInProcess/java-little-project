package q03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<30;i++){
			System.out.println(calc(i));
		}

	}
	public static int calc(int n){
		int[] rabbits=new int[n+1];
		rabbits[0]=1;
		for(int i=1;i<=n;i++){
			int parent=0;
			for(int j=0;j<=i;j++){				
				if((i-j)>=20){
					rabbits[j]=0;
				}else if((i-j)>0){
					if((i-j)%3==0){
						parent=parent+rabbits[j];
					}
				}
			}
			rabbits[i]=parent;
		}
		int sum=0;
		for(int i=0;i<=n;i++){
			sum=sum+rabbits[i];
		}
		return sum;
		
	}

}
