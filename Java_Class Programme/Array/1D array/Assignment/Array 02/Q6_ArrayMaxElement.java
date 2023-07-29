//WAP to take size of the array from user and also take integer element from user
//find the maximum element from the array
//Input:Enter size:5
//Enter array elements: 1 2 5 0 4
//Output:Max element:= 5
import java.util.Scanner;
class ArrayMaxElement{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Max Elements : "+max);
	}
}

