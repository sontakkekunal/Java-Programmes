/*
 2) Equal Left and Right Subarray Sum
Given an array A of n positive numbers. The task is to find the first index in
the array such that the sum of elements before it is equal to the sum of
elements after it.
Note: Array is 1-based indexed.
Example 1:
Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case
at position 3 elements before it
(1+3) = elements after it (2+2).

Example 2:
Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
it is the only point.

Expected Time Complexity: O(N)
Expected Space Complexity: O(1)
Constraints:
1 <= n <= 10^6
1 <= A[i] <= 10^8
*/
import java.util.*;
class Q2EqualLeftRight{
	public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int prefixSumLeft[]=new int[N];
		prefixSumLeft[0]=arr[0];
		for(int i=1;i<N;i++){
			prefixSumLeft[i]=prefixSumLeft[i-1]+arr[i];
		}
		int prefixSumRight[]= new int[N];
		prefixSumRight[N-1]=arr[N-1];
		for(int i=N-2;i>=0;i--){
			prefixSumRight[i]=prefixSumRight[i+1]+arr[i];
		}
		for(int i=0;i<N;i++){
			int left=0;
			int right=0;
			if(i!=0)
				left=prefixSumLeft[i-1];
			if(i!=N-1)
				right=prefixSumRight[i+1];
			if(left==right){
				System.out.println("Output: "+(i+1));
				break;
			}
		}
	}
}
