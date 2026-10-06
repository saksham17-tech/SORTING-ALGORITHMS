import java.util.*;
//HEAP SORT (ASCENDING ORDER)
public class heap {  
 public static void main(String[] sm) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();

    int[] arr=new int[size];

    System.out.println("Enter "+size+" elements in the array: ");
    for(int i=0;i<size;i++) arr[i]=sc.nextInt();

    buildMaxHeap(arr,size);

    for(int i=size-1;i>=1;i--) {
        swap(arr,0,i);
        heapify(arr,0,i);
    }
    /*
    for (int i=0; i <size/2; i++) //DESCENDING
    {
        swap(arr,i,size-1-i);
    }
    */
    System.out.println("\nSorted Array: ");
    for(int i=0;i<size;i++) System.out.print(arr[i]+"  ");
    sc.close();
 }

    // Build max heap
    static void buildMaxHeap(int[] arr, int size) {
        for(int i=(size/2)-1; i>=0; i--) heapify(arr,i,size);
    }

    // Heapify subtree rooted at index i
    private static void heapify(int[] arr, int i, int size) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left<size && (arr[left]>arr[largest]))   largest = left;
        if(right<size && (arr[right]>arr[largest])) largest = right;
        if(largest!=i) {
            swap(arr,i,largest);
            heapify(arr,largest,size);
        }
    }

    static void swap(int[] arr,int a,int b) {
        int tm=arr[a];
        arr[a]=arr[b];
        arr[b]=tm;
    }
}
//Best,Average,Worst case time complexity = O(n logn)