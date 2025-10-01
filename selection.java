import java.util.*;

class selection {
	public static void main(String[] sm) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		System.out.println("Enter " + (n) + " integers in the array: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		print(arr);
		sort(arr, n);
		print(arr);
		sc.close();
	}

	static void sort(int[] arr, int n) 
	{
		for (int i = 0; i < n-1; i++) 
		{
			int sm=i;
			for (int j = i+1; j<n; j++) 
			{
				if (arr[j] < arr[sm])   //arr[j]>arr[sm] for descending
					sm=j;
			}
			int t = arr[i];
			arr[i] = arr[sm];
			arr[sm] = t;
		}
	}	

	static void print(int[] arr) 
	{
		System.out.println();
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}
	// time complexity = O(n^2)
}