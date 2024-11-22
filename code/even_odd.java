import java.util.*;

public class even_odd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		char ch;
		do {

			System.out.println("Enter any number");
			n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println("even number");
			} else {
				System.out.println("Odd number");
			}
			System.out.println("Do you want to check again press Y if no then N ");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}
}
