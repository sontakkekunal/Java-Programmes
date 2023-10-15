/*
 Problem 5
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find
the missing element.
Example 1:
Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:
Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9
Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that
takes array and N as input parameters and returns the value of the missing number.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106
 */
import java.util.*;
class Q5MissingNum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter N(Array will be N-1 size): ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]=new int[N-1];
                for(int i=0;i<N-1;i++){
                        arr[i]=sc.nextInt();
                }
		int ans=(N*(N+1))/2;
		for(int i=0;i<N-1;i++){
			ans=ans-arr[i];
		}
		System.out.println("output: "+ans);
	}
}


