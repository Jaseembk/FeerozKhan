package All_Logicalprogram;

public class primeNO {

	public static void main(String[] args) {
		int x = 786 ;
		int count = 0;
		for(int i =1 ; i<=x ;i++) {
			if(x%i== 0) {
				
				
				count++;
		}  }
		if(count==2) {
			
			
			System.out.println("prime no");
		}else {
			
			System.out.println("not prime number");
		}
		
		

	}

}
