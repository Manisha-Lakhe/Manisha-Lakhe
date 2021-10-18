import java.util.*;

public class Main{
    
    public static void operation(int arr[], int size, int k){
            for(int i=0; i<size;i++){
                for(int j=0;j<size-1;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            } 
            System.out.println("smallest element"+arr[k-1]);
            System.out.println("highest element"+arr[size-k]);
    }
    
    public static void main(String args[]){
        int size;
        System.out.println("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position: ");
        int k = sc.nextInt();
        operation(arr, size, k);
    }
}