/*
 Problem 6
Given an array A of n positive numbers. The task is to find the first equilibrium point in an array.
Equilibrium point in an array is an index (or position) such that the sum of all elements before
that index is the same as the sum of elements after it.
Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
Example 1:
Input:
n = 5
A[] = {1,3,5,2,2}
Output:
3
Explanation:
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it
(2+2).
Example 2:
Input:
n = 1
A[] = {1}
Output:
1
Explanation:
Since there's only one element hence it's only the equilibrium point.
Your Task:
The task is to complete the function equilibriumPoint() which takes the array and n as input
parameters and returns the point of equilibrium.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
Constraints:
1 <= n <= 105
1 <= A[i] <= 109
*/
import java.util.*;
class Q6Euilibrium{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]=new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int leftSum[]=new int[N];
		leftSum[0]=arr[0];
		for(int i=1;i<N;i++){
			leftSum[i]=leftSum[i-1]+arr[i];
		}
		int rightSum[]= new int[N];
		rightSum[N-1]= arr[N-1];
		for(int i=N-2;i>=0;i--){
			rightSum[i]=rightSum[i+1]+arr[i];
		}
		boolean flag=true;
		for(int i=0;i<N;i++){
			int left=0;
			int right=0;
			if(i!=0)
				left=leftSum[i];
			if(i!=N-1)
				right=rightSum[i];
			if(left==right){
				System.out.println("Equiblrium at "+ (i+1));
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("No Equiblrium found "+(-1));
	}
}

