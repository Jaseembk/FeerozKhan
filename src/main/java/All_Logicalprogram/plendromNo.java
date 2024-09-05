package All_Logicalprogram;

public class plendromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 5785875;

int y =x;
int sum = 0;

while(x!=0) {
	
	int a = x%10;
 sum =sum*10+a;
x=x/10;

	}
	
	if(y==sum)
		System.out.println("print plandrom"+sum);
	else
		
		System.out.println("print not plandrom"+sum);
}
}