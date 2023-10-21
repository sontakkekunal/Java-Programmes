/*
 5) Largest subarray with 0 sum
Given an array having both positive and negative integers. The task is to
compute the length of the largest subarray with sum 0.
Example 1:
Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Constraints:
1 <= N <= 105
-1000 <= A[i] <= 1000, for each valid i
*/
import java.util.*;
class Q5LargestSubArrWithSum0{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int sum=0;
		int prefixSum[]= new int[N];
		prefixSum[0]=arr[0];
		for(int i=1;i<N;i++){
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
		int maxLength=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				if(i==0)
					sum=prefixSum[j];
				else
					sum=prefixSum[j]-prefixSum[i-1];
				if(sum==0){
					if((j-i+1)>maxLength)
						maxLength=j-i+1;
				}
			}

		}
		System.out.println("Output: "+maxLength);
	}
}
