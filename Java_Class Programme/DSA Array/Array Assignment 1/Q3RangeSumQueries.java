/*
 Q3. Range Sum Query

Problem Description
- You are given an integer array A of length N.
- You are also given a 2D integer array B with dimensions M x 2, where

each row

denotes a [L, R] query.
- For each query, you have to find the sum of all elements from L to R

indices

in A (0 - indexed).
- More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each
query.

Problem Constraints
1 <= N, M <= 103
1 <= A[i] <= 105
0 <= L <= R < N

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]]

Example Output
Output 1:
[10, 5]

Output 2:
[2, 4]

Example Explanation
Explanation 1:
The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
Explanation 2:
The sum of all elements of A[0 ... 0] = 2 = 2.
The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
*/
import java.util.*;
class Q3RangeSumQueries{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter number of 2d array: ");
		int n=sc.nextInt();
		int arr1[][]=new int[n][2];
		for(int i=0;i<n;i++){
			System.out.println("Enter "+(i+1)+" 2d array: ");
			for(int j=0;j<2;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		int leftPrefixSum[]= new int[N];
		leftPrefixSum[0]=arr[0];
		for(int i=1;i<N;i++){
			leftPrefixSum[i]=leftPrefixSum[i-1]+arr[i];
		}
		System.out.println("Output: ");
		for(int i=0;i<n;i++){
			int ans=0;
			if(arr1[i][0]==0)
				ans=leftPrefixSum[arr1[i][1]];
			else
				ans=leftPrefixSum[arr1[i][1]]-leftPrefixSum[arr1[i][0]-1];

			System.out.println(ans);
		}
	}
}


