/*
Problem Statement 9:
You are given a 0-indexed integer array nums and a target element target.
A target index is an index i such that nums[i] == target.
Return a list of the target indices of nums after sorting nums in non-decreasing
order. If there are no target indices, return an empty list. The returned list must be
sorted in increasing order.

Example 1:
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.

Example 2:
Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
Example 3:
Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.

Constraints:
1 <= nums.length <= 100
1 <= nums[i], target <= 100
*/
import java.util.Scanner;
import java.util.ArrayList;
class Q9SortAndSearching{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target=sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1;i<arr.length;i++){
			int element=arr[i];
			int j=i-1;
			while(arr[j]>element && j>=0){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		for(int i=0;i<arr.length;i++){
			if(target==arr[i])
				al.add(i);
		}
		System.out.println("Output: "+al);
	}
}

