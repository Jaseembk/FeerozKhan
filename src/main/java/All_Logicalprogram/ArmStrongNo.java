package All_Logicalprogram;

public class ArmStrongNo {

	public static void main(String[] args) {
		int x = 153;
		int y=x;
		int sum=0;
		while(x!=0) {
			
		int	a=x%10;
		sum = sum+a*a*a;
		x=x/10;
			
			
		}
		if(y==sum) {
			
			System.out.println("armstrong Number");
		}else {
			
			System.out.println("not ArmStrong Number");
		}

	}

}
