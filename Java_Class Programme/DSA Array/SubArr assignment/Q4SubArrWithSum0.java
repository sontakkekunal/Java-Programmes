/*
 4) Subarray with 0 sum
Given an array of positive and negative numbers. Find if there is a subarray
(of size at-least one) with 0 sum.
Example 1:
Input:
5
4 2 -3 1 6
Output:
Yes
Explanation:
2, -3, 1 is the subarray
with sum 0.
Example 2:
Input:
5
4 2 0 1 6
Output:
Yes
Explanation:
0 is one of the element
in the array so there exist a
subarray with sum 0.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
Constraints:
1 <= n <= 10^4
-10^5 <= a[i] <= 10^5
*/
import java.util.*;
class Q4SubArrWithSum0{
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
		String str="No";
		int prefixSum[]= new int[N];
		prefixSum[0]=arr[0];
		for(int i=1;i<N;i++){
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
		boolean flag=false;
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				if(i==0)
					sum=prefixSum[j];
				else
					sum=prefixSum[j]-prefixSum[i-1];
				if(sum==0){
					str="Yes";
					flag=true;
					break;
				}
			}
			if(flag)
				break;

		}
		System.out.println("Output: "+str);
	}
}
