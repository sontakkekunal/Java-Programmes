/*
 Problem 1:
Given an array containing n integers. The problem is to find the sum of the
elements of the contiguous subarray having the smallest(minimum) sum.
Examples:
Input : arr[] = {3, -4, 2, -3, -1, 7, -5}
Output : -6
Subarray is {-4, 2, -3, -1} = -6
Input : arr = {2, 6, 8, 1, 4}
Output : 1
*/
import java.util.*;
class Q1MinSubArray{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int N=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		int leftSum[]= new int[N];
		leftSum[0]=arr[0];
		for(int i=1;i<N;i++){
			leftSum[i]=leftSum[i-1]+arr[i];
		}
		int diff=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			for(int j=0;j<=i;j++){
				int sum=0;
				if(j==0)
					sum=leftSum[i];
				else
					sum=leftSum[i]-leftSum[j-1];
				if(sum<diff)
					diff=sum;
			}
		}
		System.out.println("Output: "+diff);
	}
}

