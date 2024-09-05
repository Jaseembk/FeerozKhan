package All_Logicalprogram;


import java.util.Set;

public class reverseNumber {

	public static void main(String[] args) {
		
  int x= 3135;
  
  int sum=0;
  
  while(x!=0) {
	  
	  int a=x%10;
  sum =sum *10 +a;
  x=x/10;
	}
  System.out.println(sum);
	}

}
