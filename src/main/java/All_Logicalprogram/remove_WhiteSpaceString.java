package All_Logicalprogram;

public class remove_WhiteSpaceString {

	public static void main(String[] args) {
	
		
		String s1 = "my name is Khan";
		String s2 = " ";
		
		for(int i = 0; i<s1.length(); i++)
		{
			
			if(s1.charAt(i) != ' '){
				
			s2=s2+s1.charAt(i)	;
			}
				
			
			}
		System.out.println(s2);
			
		}
		
	
}
