import java.util.*;
public class palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter any dig number");
		n=sc.nextInt();
		int temp=0;
		int c=n;
		int rev=0;
		do {
			temp=n%10;
			rev=rev*10+temp;
			 n=n/10;
		} while (n>0);
		if (rev==c) {
			System.out.println("palin drom number");
		}
		else
		{
			System.out.println("not palindrom number");

		}	  
		
	}
}
