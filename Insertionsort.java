import java.util.*;
public class Insertionsort {
    public static void insert(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 &&arr[j]>temp ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
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
        insert(arr);
        System.out.println("Sorted Array");
        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
    
}
