//WAP to print the second min element in the array
//Input:Enter array element: 255 2 1554 15 65 95 89
//Output:15
import java.util.Scanner;
class ArraySecMin{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				int temp;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second minimun no. in array is "+arr[1]);
	}
}

