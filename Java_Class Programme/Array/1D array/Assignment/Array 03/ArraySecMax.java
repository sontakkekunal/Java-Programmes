//WAP a program to print the second max element in the array
//Input: Enter array Elements: 2 252 2 1554 15 65
//Output: 255
import java.util.Scanner;
class ArraySecMax{
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
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second maximun no. in array is "+arr[1]);
	}
}


