/*
 2. Two Sum (Leetcode:- 1)

Given an array of integer numbers and an integer target, return indices of
the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you
may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
import java.util.*;
class Q2TwoSum{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int N=sc.nextInt();
		int arr[]= new int[N];
		System.out.println("Enter array: ");
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target=sc.nextInt();
		int j=1;
		System.out.println("output: ");
		for(int i=0;i<N-1;i++){
			if(arr[i]+arr[j]==target){
				System.out.println("["+i+","+j+"]");
			}
			j++;
		}
	}
}


