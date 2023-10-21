/*
 3) Largest subarray of 0's and 1's
Given an array of 0s and 1s. Find the length of the largest subarray with
equal number of 0s and 1s.
Example 1:
Input:
N = 4
A[] = {0,1,0,1}
Output: 4
Explanation: The array from index [0...3]
contains equal numbers of 0's and 1's.
Thus maximum length of subarray having
equal number of 0's and 1's is 4.
Example 2:
Input:
N = 5
A[] = {0,0,1,0,0}
Output: 2
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Constraints:
1 <= N <= 10^5
0 <= A[] <= 1
*/
import java.util.*;
class Q3LargestSubArr0{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		int maxLength=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
			int sum=0;
			int length=Integer.MIN_VALUE;
			for(int j=i;j<N;j++){
				sum=sum+arr[j];
				if((sum*2)==j-i+1)
					length=j-i+1;
				if(length>maxLength)
					maxLength=length;
			}
		}
		System.out.println("Output: "+maxLength);
	}
}

