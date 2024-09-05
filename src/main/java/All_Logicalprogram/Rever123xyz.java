package All_Logicalprogram;

public class Rever123xyz {

	public static void main(String[] args) {
		String s1 = "123xyz";
		String s2 = reversString(s1);
		System.out.println(s2);
	}
	public  static String reversString (String s1) {
		
		int i =0 ;
		while(i<s1.length() && Character.isDigit(s1.charAt(i))) {
			
		i++;
		
		
		}
		 String NPart= s1.substring(0,i);
		 
		 String Apart= s1.substring(i);
				 
				 String rev = new StringBuilder(Apart).reverse().toString();
		 
		 return NPart + rev ;
	

	}

}
