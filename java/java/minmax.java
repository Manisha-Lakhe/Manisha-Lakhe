import java.util.*;
class minmax{
	public static void operation(int[] arr, int size){
		int min =  arr[0], max = arr[0];
		for(int i = 1; i<size; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("Minimum num : " +min);
		System.out.println("Maximum num : "+max);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		operation(arr,size);
	}
}
