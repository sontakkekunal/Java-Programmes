/*
21] Kadane's Algorithm

Given an array Arr[] of N integers. Find the contiguous sub-array(containing at
least one number) which has the maximum sum and return its sum.
Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous
subarray.
Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 of element (-1)
*/
import java.util.*;
class Q19KadanesAlgo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]=new int[size];
		int n=0;
		int N=0;
		int j=0;
		int k=0;
		boolean flag=true;
		int sum1=0;
		for(int i=0;i<=N;i++){
			if(i==N && n==arr.length)
				break;
			if(i==N){
				arr[j]=sc.nextInt();
			}
			if(k<j){
				int sum=0;
				int num=0;
				if(j>=n)
					num=j-1;
				else
					num=j;
				
				for(int m=k;m<=num;m++){
					sum=sum+arr[m];
				}
				if(flag){
					flag=false;
					sum1=sum;
				}
				if(sum>sum1)
					sum1=sum;
			}
			k++;
			if(i==N){
				j++;
				k=0;
				n++;
				N=N+n;
			}
		}
		System.out.println("Output: "+sum1);
	}
}
