import java.util.*;

public class prime {
	public static void main(String args[]) {
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// System.out.println(n);
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0){
				count++;
				// System.out.println(n%i);			
			}
				}
		
		if (count==2){
			System.out.println("yes it's prime number");
						}
		else {
			System.out.println("not prime number");
		}
	}
}
