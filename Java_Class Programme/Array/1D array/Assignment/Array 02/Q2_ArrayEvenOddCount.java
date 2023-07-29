//WAP to find the number of even  and odd integer in a given array of integers
//Input: 1 2 5 4 6 7 8
//Output:
//Number of Even Elements: 4
//Number of Odd Elements: 3
import java.util.Scanner;
class ArrayEvenOddCount{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		int evenCount=0,oddCount=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==0);
			else if(arr[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("Number of Even Elements : "+evenCount);
                System.out.println("Number of Odd Elements : "+oddCount);
	}
}

