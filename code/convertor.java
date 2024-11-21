import java.util.*;

public class convertor {
	public static void main(String args[]) {
		System.out.println("Welcome To Convertor");
		double meter;
		double centimeter;
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.cm to m\n 2.cm to feet\n 3. cm to inch\n 4. cm to mm");
		System.out.println("choose opation");
		num = sc.nextInt();
		System.out.println("enter centimeter(cm)");
		if (num == 1) {
			centimeter = sc.nextDouble();
			meter = centimeter / 100;
			System.out.println(meter + "m");
		}
		else if (num==2)
		{
			centimeter = sc.nextDouble();
			meter = centimeter / 30.48;
			System.out.println(meter + "feet");
		}
				else if (num==3)
		{
			centimeter = sc.nextDouble();
			meter = centimeter *0.393701;
			System.out.println(meter + "inch");
		}
		else if (num==4)
		{
			centimeter = sc.nextDouble();
			meter = centimeter *10;
			System.out.println(meter + "mm");
		}
		else
		{
			System.out.println("invalid key");
		}
	}
}
