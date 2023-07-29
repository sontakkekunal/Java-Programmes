//WAP to take size of the array from user and also take integer element from user
//find the minimum element from the array
//Input:Enter size:5
//Enter array elements: 1 2 5 0 4
//Output:Min element:= 0
import java.util.Scanner;
class ArrayMiniElement{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int mini=arr[0];
		for(int i=0;i<size;i++){
			if(mini>arr[i])
				mini=arr[i];
		}
		System.out.println("Mini elements= "+mini);
	}
}
