import java.util.*;
public class Merge_two_sorted_array {
    public static void sort(int[] arr1,int[]arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] result=new int[(arr1.length+arr2.length)];
        while(i<arr1.length &&j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
                k++;
            }
            else{
                result[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            result[k]=arr2[j];
            j++;
            k++;
        }
        for(int l=0;l<result.length;l++){
            System.out.print(result[l] +" ");
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st  Array");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];
        for(int i=0;i<size1;i++){
            System.out.println("Enter the element "+(i+1)+":");
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of 2nd Array");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];
        for(int i=0;i<size2;i++){
            System.out.println("Enter the element "+(i+1)+":");
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        sort(arr1,arr2);

        
    }
    
}
