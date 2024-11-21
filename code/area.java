import java.util.*;

public class area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int l;
		int b;
		int r;
		int area;
		int ch;

		System.out.println("1.Square");
		System.out.println("2.Rectangel");
		System.out.println("3.Circle");
		ch = sc.nextInt();
		if (ch == 1) {

			System.out.println("enter side");
			n = sc.nextInt();
			area = n * n;
			System.out.println("area of square=" + area);

		} else if (ch == 2) {

			System.out.println("enter lenght & widht");
			l = sc.nextInt();
			b = sc.nextInt();
			area = l * b;
			System.out.println("area of square=" + area);

		} else if (ch == 3) {

			System.out.println("enter redius");
			r = sc.nextInt();
			double area1 = 3.14 * r * r;
			System.out.println("area of square=" + area1);

		}

		else {
			System.out.println("choose valid opation");

		}

	}

}
