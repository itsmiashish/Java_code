import java.util.*;

public class subarr {
	public static void main(String args[]) {
		int n[] = { 1, 2, 3, 4, 5};
		for (int i = 0; i < n.length; i++) {
			int sum=0;
			for (int j = i; j < n.length; j++) 	
			{
				
				sum+=n[j];
				System.out.println("Sum of subarray [" + i + " to " + j + "] is: " + sum);
				
			}		
							}
			}
	
}

