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
		int sumleft=0;
		int sumRight=0;
		for(int i=N-1;i>=0;i--){
			sumRight=sumRight+arr[i];
		}
		for(int i=0;i<N;i++){
			if(i!=0)
				sumleft=sumleft+arr[i-1];
			sumRight=sumRight-arr[i];
			if(sumRight==sumleft){
				System.out.println("Output: "+(i+1));
				break;
			}
		}
	}
}
