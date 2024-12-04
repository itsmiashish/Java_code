public class butterfly {
	public static void main(String[] args) {
		int k=5;
		for(int i=0;i<k;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
				for(int j=1;j<=2*(k-i);j++)
			{ 
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//2
		for(int i=k;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
				for(int j=1;j<=2*(k-i);j++)
			{ 
				System.out.print(" ");
			}
	  			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
		
	}
