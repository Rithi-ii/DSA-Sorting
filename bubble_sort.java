import java.util.*;
public class bubble_sort{
     static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean a=true; //to reduce complexity
            for(int j=0;j<arr.length -1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    a=false;
                }
                
            } 
            if(a==true){
                break;
            }  
        }   
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        bubble(arr);
        System.out.println("Sorted array is: ");
        for(int x :arr){
            System.out.print(x+" ");
        }


    }
}