import java.util.*;
public class swap {
	public static void main(String[] args) {
		int n;
		int k;
		int s;
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Two Diffrent number");
		// n=sc.nextInt();
		// k=sc.nextInt();
		// s=n;
		// n=k;
		// k=s;
		// System.out.println("this swapping is using third variable");
		// System.out.println("After Swapping"+"\n"+ n +"\n"+k);

		System.out.println(" now swapping  without using any third variable");
		int p;
		int c;
		p= sc.nextInt();
		c=sc.nextInt();
		p=p+c;
		c=p-c;
		p=p-c;
		
		System.out.println("After Swapping"+"\n"+ p +"\n"+c);

	}
}
