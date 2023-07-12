//WAP a create an array of 'n' integer elements
//Where 'n' value should be taken from the user
//Insert the values from the users and find the sum of all elements in the array
//Input:
//n=6
//Enter element in the array : 2 3  6 9 5 1
//Output:26
import java.util.Scanner;
class ArraySum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		int sum=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements is : "+sum);
	}
}

