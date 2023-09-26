/*
 30] Count the subarrays having product less than k
Given an array of positive numbers, the task is to find the number of possible
contiguous subarrays having product less than a given number k.
Example 1:
Input :
n = 4, k = 10
a[] = {1, 2, 3, 4}
Output : 7
Explanation:
The contiguous subarrays are {1}, {2}, {3}, {4}
{1, 2}, {1, 2, 3} and {2, 3}, in all these subarrays
product of elements is less than 10, count of
such a subarray is 7.
{2,3,4} will not be a valid subarray, because
2*3*4=24 which is greater than 10.
Example 2:
Input:
n = 7 , k = 100
a[] = {1, 9, 2, 8, 6, 4, 3}
Output:16
*/
import java.util.*;
class Q30SubArrayLessThanProductK{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter K: ");
		int m=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				int product=1;
				for(int k=j;k<=i;k++){
					product=product*arr[k];
				}
				if(product<m)
					count++;
			}
		}
		System.out.println("Number of subarray product less than are:  "+count);
	}
}

				
				

