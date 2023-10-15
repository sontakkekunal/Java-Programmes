/*
 Problem 7
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the
product of the maximum product subarray.
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
 */
import java.util.*;
class Q7MaxProductArray{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]=new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int leftProduct[]= new int[N];
		leftProduct[0]=arr[0];
		for(int i=1;i<N;i++){
			leftProduct[i]=leftProduct[i-1]*arr[i];
		}
		int maxProduct=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
			if(leftProduct[i]==0)
				break;
			for(int j=0;j<=i;j++){
				int product=0;
				if(j==0)
					product=leftProduct[i];
				else
					product=leftProduct[i]/leftProduct[j-1];
				if(product>maxProduct)
					maxProduct=product;
			}
		}
		System.out.println("Output: "+maxProduct);
	}
}
