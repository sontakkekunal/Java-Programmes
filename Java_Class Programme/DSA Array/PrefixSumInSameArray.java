/*
 In place sum
 problem Description
 Given an array A of N integer
 Construct prefix sum of the array sum of the array in the given array itself
 Return an array of integer denoting the prefix sum.
 */
import java.util.Scanner;
class PrefixSumInSameArray{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int N=sc.nextInt();
		System.out.println("Enter arry: ");
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<N;i++){
			arr[i]=arr[i-1]+arr[i];
		}
		System.out.println("Output: ");
		for(int i=0;i<N;i++){
                        System.out.println(arr[i]);
                }
	}
}
