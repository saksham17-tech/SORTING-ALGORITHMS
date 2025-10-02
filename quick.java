import java.util.*;
class quick
{
    public static void main(String[] sm) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =sc.nextInt();
        System.out.println("Enter "+(n)+" integers in the array: ");
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
        sc.close();
    }

    static void quicksort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }

    static int partition(int[] arr,int low, int high)
    {
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot; 
        arr[high]=temp;
        return i;
    } 

    static void print(int[] arr)
    {
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    //time complexity = O(n logn)
}