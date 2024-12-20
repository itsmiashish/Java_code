public class rainwater {
	// public static void main(String[] args) {
	// 	int n []={4,2,0,6,3,2,5};
	// 	int k=0;
	// 	int sum=0;
	// 	System.out.println("trapping rainwater program");
	// 	for(int i=0;i<n.length;i++)
	// 	{
	// 		int leftmax=n[0];
	// 			if(leftmax<n[i])
	// 		{
	// 		leftmax=n[i];
	// 		}
	// 		System.out.println(leftmax);


			
	// 	}
	// }

	public static void main(String[] args) {
		int n[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Trapping Rainwater Program");

        // Step 1: Leftmax calculate karna
        int leftmax[] = new int[n.length];
        leftmax[0] = n[0]; // Pehla element wahi hoga
        for (int i = 1; i < n.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], n[i]);
        }

        // Step 2: Rightmax calculate karna
        int rightmax[] = new int[n.length];
        rightmax[n.length - 1] = n[n.length - 1]; // Last element wahi hoga
        for (int i = n.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], n[i]);
        }

        // Step 3: Min value calculate karna
        int minValue[] = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            minValue[i] = Math.min(leftmax[i], rightmax[i]);
        }

        // Step 4: MinValue me se index value subtract karke totalWater calculate karna
        int totalWater = 0;
        for (int i = 0; i < n.length; i++) {
            // Only add to totalWater if minValue[i] > n[i]
            if (minValue[i] > n[i]) {
                totalWater += minValue[i] - n[i];
            }
        }

        // // Leftmax array print karna
        // System.out.println("Left max values:");
        // for (int i = 0; i < n.length; i++) {
        //     System.out.print(leftmax[i] + " ");
        // }

        System.out.println();

        // Rightmax array print karna
        // System.out.println("Right max values:");
        // for (int i = 0; i < n.length; i++) {
        //     System.out.print(rightmax[i] + " ");
        // }

        System.out.println();

        // MinValue array print karna
            for (int i = 0; i < n.length; i++) {
            // System.out.print(minValue[i] + " ");
        }

       

        // Total trapped water print karna
        System.out.println("Total water trapped: " + totalWater);
    }
}
