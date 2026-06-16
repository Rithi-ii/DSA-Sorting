import java.util.*;
public class Selectionsort {
    public static void selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;

                }  
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;

        }

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
        selection(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    
}
