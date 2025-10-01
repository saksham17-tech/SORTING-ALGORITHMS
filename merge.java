import java.util.*;
class merge
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
        divide(arr,0,n-1); 
        print(arr);
        sc.close();
    }

    static void divide(int[] arr, int si, int ei)
    {
        if(si>=ei)
        return;

        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }

    static void conquer(int[] arr,int si, int mid, int ei)
    {
        int[] merged= new int[ei-si+1];
        int x1=si;
        int x2=mid+1;
        int x=0;

        while(x1<=mid && x2<=ei)
        {
            if(arr[x1]<arr[x2]) //arr[x1]>arr[x2] for descending
            merged[x++]=arr[x1++];
            else
            merged[x++]=arr[x2++];
        }

        while(x1<=mid)
        {
            merged[x++]=arr[x1++];
        }

        while(x2<=ei)
        {
            merged[x++]=arr[x2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
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
    //time complexity = O(n logn)
}