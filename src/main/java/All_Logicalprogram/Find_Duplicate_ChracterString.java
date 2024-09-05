package All_Logicalprogram;

public class Find_Duplicate_ChracterString {
	public static void main(String[] args) {
		
	
	
	String s1 ="continue" ;
	for(int i =0; i<s1.length(); i++) {
		for(int j =i+1; j<s1.length(); j++) {
			
			
			if(s1.charAt(i)==s1.charAt(j)) {
				
				
				System.out.print(s1.charAt(i));
				
				
			}
		}
		
		
		
	}}}


