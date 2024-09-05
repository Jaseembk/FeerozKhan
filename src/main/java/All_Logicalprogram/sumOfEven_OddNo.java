package All_Logicalprogram;

public class sumOfEven_OddNo {

	public static void main(String[] args) {
		int x= 4257167;
		int sum =0;
		
		while(x!=0)
		{
			int a= x%10;
			if(x%2==0) {
				
				sum =sum+a;
			}
			x=x/10;
		}
		System.out.println(sum);
	}

}
