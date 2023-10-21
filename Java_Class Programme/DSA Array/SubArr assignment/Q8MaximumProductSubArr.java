/*
 8) Maximum Product Subarray
Given an array Arr[] that contains N integers (may be positive, negative or
zero). Find the product of the maximum product subarray.
Example 1:
Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives the product as 180.
Example 2:
Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives the product as 120.

Note: Use 64-bit integer data type to avoid overflow.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 500
-10^2 ≤ Arri ≤ 10^2
*/
import java.util.*;
class Q8MaxProductSubArr{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int product=1;
		int m=0;
		int n=0;
		int product1=1;
		int maxProduct=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
			product=product*arr[i];
			if(product>maxProduct){
				maxProduct=product;
			}
			if(n>0)
				product1=product1*arr[i];
			if(product1>maxProduct){
                                maxProduct=product1;
                        }
			if(product==0)
				product=1;
			if(product1==0)
				product1=1;
			if(product<0){
				n++;
			}
			if(n>m && n%2==1){
				product1=1;
				m++;
			}
		}
		System.out.println("Output: "+maxProduct);
	}
}
