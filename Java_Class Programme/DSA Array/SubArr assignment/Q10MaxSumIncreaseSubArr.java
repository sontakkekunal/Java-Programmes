/*
 10) Find Maximum Sum Strictly Increasing Subarray
Given an array of positive integers. Find the maximum sum of strictly
increasing subarrays.
Example 1:
Input :
arr[] = {1, 2, 3, 2, 5, 1, 7}
Output :
8
Explanation :
Some Strictly increasing subarrays are -
{1, 2, 3} sum = 6,
{2, 5} sum = 7,
{1, 7} sum = 8,

maximum sum = 8

Example 2:
Input:
arr[] = {1, 2, 2, 4}
Output:
6

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^5
1 ≤ A[i] ≤ 1000
*/
import java.util.*;
class Q10MaxSumIncreaseSunArr{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int sum=arr[0];
		int maxSum=Integer.MIN_VALUE;
		for(int i=1;i<N;i++){
			if(arr[i-1]<arr[i]){
				sum=sum+arr[i];
			}
			if(arr[i-1]>=arr[i]){
				if(sum>maxSum)
					maxSum=sum;
				sum=arr[i];
			}
		}
		if(sum>maxSum)
                	maxSum=sum;
		System.out.println("Output: "+maxSum);
	}
}

