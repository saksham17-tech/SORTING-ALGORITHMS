import java.util.*;
class bubble
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
        sort(arr,n);
        print(arr);
        sc.close();
    }

    static void sort(int[] arr, int n)
    {
        boolean flag=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int x=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;
                    flag=true;
                }                
            }
            if(!flag)
                break;
        }        
    }

    static void print(int[] arr)
    {
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    //time complexity = O(n^2)

}

