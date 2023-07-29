//WAP to find the sum of even and odd number in an array.
//Display the sum value
//Input: 11 12 13 14 15
//Output:
//Even Number sum=39
//Odd Number sum= 26
import java.util.Scanner;
class ArrayEvenOddSum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		int evenSum=0,oddSum=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==0);
			else if(arr[i]%2==0)
				evenSum=evenSum+arr[i];
			else
				oddSum=oddSum+arr[i];
		}
		System.out.println("Sum of Even Elements : "+evenSum);
                System.out.println("Sum of Odd Elements : "+oddSum);
	}
}

