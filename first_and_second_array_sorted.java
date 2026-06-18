import java.util.*;
public class first_and_second_array_sorted {
    public static void Merge(int[] arr){
        int start=0;
        int last=arr.length;
        int mid=last/2;
        int i=0,j=mid;
        int[] result=new int[last];
        int k=0;
        while(i<mid &&j<last){
            if(arr[i]<arr[j]){
                result[k]=arr[i];
                i++;
                k++;
            }else{
                result[k]=arr[j];
                k++;
                j++;
            }

        }
        while(i<mid){
            result[k]=arr[i];
            i++;
            k++;
        }
        while(j<last){
            result[k]=arr[j];
            j++;
            k++;
        }
        for(int l:result){
            System.out.print(l+" ");

        }
        


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        Merge(arr);



    }
    
}
