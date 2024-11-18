import java.util.*;
public class factorial {
	public static void main (String args[])
	{
		int n;
		int f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
	
		
			for(int i=n;i>=1;i--)
			{
				System.out.println(f+"*"+i+"="+f);
			f=f*i;
				

			}
			System.out.println("Factorial="+f);
		
		
	}
}
