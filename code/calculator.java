import java.util.*;
public class calculator {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two digits any number");
		a= sc.nextInt();
		b= sc.nextInt();
         int add = a+b;
		 System.out.println("Addition to two number ="+add);
		 int sub = a-b;
		 System.out.println("Subtraction to two number ="+sub);
		 int multi = a*b;
		 System.out.println("Multiplication to two number ="+multi);
		float div =  a/b;
		 System.out.println("Division4 to two number ="+div);
     System.out.println();
	 System.out.println();
	 System.out.println("This is simple calculator model we are devlop and add some new features 🙂");
	}
}
