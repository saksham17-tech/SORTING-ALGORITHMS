import java.util.*;

class insertion 
{
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
		for (int i=1;i<n;i++) 
		{
			int currentval=arr[i];
            int previousvalue=i-1;
            while (previousvalue>=0 && arr[previousvalue] > currentval)//arr[previousvalue]<currentval,for descending
            {
                arr[previousvalue+1]=arr[previousvalue];
                previousvalue--;
            }
            arr[previousvalue+1]=currentval;
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