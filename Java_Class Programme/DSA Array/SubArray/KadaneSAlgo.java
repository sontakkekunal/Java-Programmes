//Josafe Kadane discover Kadanes Algorithm in 1984
import java.util.Scanner;
class KadanesAlgo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int N=sc.nextInt();
		int arr[]= new int[N];
		System.out.println("Enter array: ");
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
			sum=sum+arr[i];

			if(sum>maxSum)
				maxSum=sum;

			if(sum<0)
				sum=0;
		}
		System.out.println("Sum of maximum subarray is : "+maxSum);
	}
}
