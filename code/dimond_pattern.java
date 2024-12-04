import java.util.Scanner;

public class dimond_pattern {
	public static void main(String[] args) throws InterruptedException { 
		// Scanner sc = new Scanner(System.in);
		// System.out.println("enter size according to your choice");
		int n =5;

		for (int i = 1; i <=n; i++) {
			for (int j = 0; j <=(n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				Thread.sleep(100);
			}

			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (n - i); j++) {
				System.out.print("* ");
				Thread.sleep(100);
			}

			System.out.println();
		}
	}
}