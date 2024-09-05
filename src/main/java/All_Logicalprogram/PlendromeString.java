package All_Logicalprogram;

public class PlendromeString {
	public static void main(String[]args) {

		
		String s1 = "mihim";
		String s2 ="";
		
		int len = s1.length();
		for (int i= len-1; i>=0 ; i--) {
			 s2= s2+s1.charAt(i);
			 
		}
		if(s2.equals(s1))
			
			System.out.println("plendron String");
		else 
			System.out.println("not Plendrome String");
			
		
		
	}
	
	
	
	
	
}