package All_Logicalprogram;

public class First_latterUppercas {

	public static void main(String[] args) {
	
		
		String s1 = "india is my country";
		
		String arr[] =s1.split(" ");
		
		
	        for(int i = 0; i < arr.length; i++) {
	        	
	            String s2 = arr[i].substring(0, 1).toUpperCase();
	            String s3 = arr[i].substring(1);
	            System.out.print(s2 + s3 + " ");
	        }
	    }
	
}	
			
		
				

	


