/*
 3. Search Insert Position (LeetCode-35)

Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be if it were
inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/
import java.util.*;
class Q3SearchPosition{
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
		int val=0;
		boolean flag=true;
		for(int i=0;i<N;i++){
			if(arr[i]>=target){
				val=i;
				flag=false;
				break;
			}
		}
		if(flag){
			val=N;
		}
		System.out.println("ouput: "+val);
	}
}

