import java.util.*;

class zeroandone{
	public static void sort(int arr[], int size){
		int s[] = new int[size];
		int i = 0;
		for(int j = 0; j<3; j++){
			for(int k = 0 ; k<size; k++){
				if(arr[k] == j){
					s[i] = arr[k];
					i++;
				}
			}
		}
		for(i=0; i<size; i++){
			System.out.print(s[i]);
		}
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}		
		sort(arr, size);
	}
}

