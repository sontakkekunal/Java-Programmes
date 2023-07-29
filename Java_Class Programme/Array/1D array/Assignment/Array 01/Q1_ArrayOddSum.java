//WAP to take size of array from user and also integer elements from user Print sum
//of odd elements only
//Input:Enter size:5
//Enter array elements: 1 2 3 4 5
//Output: 9
//1+3+5
import java.util.Scanner;
class ArrayOddSum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		int oddSum=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==0);
			else if(arr[i]%2==1)
				oddSum=oddSum+arr[i];
		}
                System.out.println("Sum of Odd Elements : "+oddSum);
	}
}

