package All_Logicalprogram;

public class febonasiSeries {

	public static void main(String[] args) {
		int a= -1;
		int b = 1;
		int c=0;
		
		for(int i=1; i<=8; i++) {
			
			c=a+b; 
			
			System.out.print(c);
			
			a=b;
			
			b=c;
			
		}
	}

}
