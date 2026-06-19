import java.util.*;

public class quicksort {
    static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pi=partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        quickSort(arr, 0,size-1);
        System.out.println("Sorted array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}