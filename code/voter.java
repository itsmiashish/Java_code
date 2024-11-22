import java.util.*;

public class voter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println(" Please Enter Your Age");
		n = sc.nextInt();
		if (n >= 18) {
			System.out.println("Congrast! you can do vote.");
		} else {
			System.out.println("Opps! you can't do vote.");
		}

	}

}
