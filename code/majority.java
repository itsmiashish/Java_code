import java.util.*;

public class majority {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.println("enter size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter element in array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("first duplicate element =" + arr[i]);
					temp = temp + 1;
					break;
				}
			}
			if (temp > 0) {
				break;
			}

		}

	}
}
