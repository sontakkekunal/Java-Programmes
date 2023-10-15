/*
 Problem 4:
Given an array of positive integers nums and a positive integer target, return the minimal length
of a
subarray
whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

Constraints:
1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
*/
import java.util.*;
class Q4PostiveTarget{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int N=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target=sc.nextInt();
		int leftSum[]= new int[N];
		leftSum[0]=arr[0];
		for(int i=1;i<N;i++){
			leftSum[i]=leftSum[i-1]+arr[i];
		}
		int diff=Integer.MAX_VALUE;
		boolean flag=true;
		for(int i=0;i<N;i++){
			for(int j=0;j<=i;j++){
				int sum=0;
				if(j==0)
					sum=leftSum[i];
				else
					sum=leftSum[i]-leftSum[j-1];
				if(sum>=target && (i-j+1)<diff){
					diff=i-j+1;
					flag=false;
				}
			}
		}
		if(flag)
			System.out.println("Output: "+0);
		else
			System.out.println("Output: "+diff);
	}
}
