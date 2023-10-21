/*
 6) Smallest subarray with sum greater than x
Given an array of integers (A[]) and a number x, find the smallest subarray
with sum greater than the given value. If such a subarray does not exist,
return 0 in that case.
Example 1:
Input:
A[] = {1, 4, 45, 6, 0, 19}
x = 51
Output: 3
Explanation:
Minimum length subarray is
{4, 45, 6}

Example 2:
Input:
A[] = {1, 10, 5, 2, 7}
x = 9
Output: 1
Explanation:
Minimum length subarray is {10}
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N, x ≤ 10^5
0 ≤ A[] ≤ 10^4
*/
import java.util.*;
class Q6SmallestSubArrWithSumGreterThan0{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter x: ");
		int x=sc.nextInt();
		int sum=0;
		int prefixSum[]= new int[N];
		prefixSum[0]=arr[0];
		for(int i=1;i<N;i++){
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
		int minLength=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				if(i==0)
					sum=prefixSum[j];
				else
					sum=prefixSum[j]-prefixSum[i-1];
				if(sum>x){
					if((j-i+1)<minLength)
						minLength=j-i+1;
				}
			}

		}
		System.out.println("Output: "+minLength);
	}
}
