import java.util.*;
public class bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float height;
		int weight;
		float m_height;
	double bmi;
		System.out.println("Enter height");
		height=sc.nextFloat();
		System.out.println("Enter weight");
		weight=sc.nextInt();
		m_height=height/100;
	bmi = weight/(m_height*m_height);
	System.out.println("bmi ="+bmi);
 
	}
}
