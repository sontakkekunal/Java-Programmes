/*
 9) Maximum of all subarrays of size k
Given an array arr[] of size N and an integer K. Find the maximum for each
and every contiguous subarray of size K.
Example 1:
Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output:
3 3 4 5 5 5 6
Explanation:
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6
Example 2:
Input:
N = 10, K = 4
arr[] = 8 5 10 7 9 4 15 12 90 13
Output:

10 10 10 15 15 90 90
Explanation:
1st contiguous subarray = {8 5 10 7}, Max = 10
2nd contiguous subarray = {5 10 7 9}, Max = 10
3rd contiguous subarray = {10 7 9 4}, Max = 10
4th contiguous subarray = {7 9 4 15}, Max = 15
5th contiguous subarray = {9 4 15 12},
Max = 15
6th contiguous subarray = {4 15 12 90},
Max = 90
7th contiguous subarray = {15 12 90 13},
Max = 90
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(k)
Constraints:
1 ≤ N ≤ 10^5
1 ≤ K ≤ N
0 ≤ arr[i] ≤ 10^7
*/
import java.util.*;
class Q9MaxSubArrOfSizeK{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter K size: ");
		int k=sc.nextInt();
		System.out.println("Output: ");
		for(int i=0;i<N;i++){
			int max=Integer.MIN_VALUE;
			for(int j=i;j<i+k && i+k<=N;j++){
				if(arr[j]>max)
					max=arr[j];
			}
			if(i+k>N)
				break;
			System.out.print(max+"  ");
		}
		System.out.println();
	}
}
			
