import java.util.*;
public class stock {
	public static void main(String[] args) {
		int max= Integer.MAX_VALUE;
		int n[]={40,2,3,56,6,1};
		int max_Profit=0;
		int profit=0;
		for (int i = 0; i < n.length; i++) {
			if (max<=n[i]) {
				 profit= (n[i]-max);
max_Profit=Math.max(max_Profit, profit);
			}
			else
			{
				max=n[i];
			}
		}
		System.out.println("total profit ="+ max_Profit);
 	}
}
