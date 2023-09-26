/*
 18] Find Subarray with given sum | Set 1 (Non-negative
Numbers)
Given an array arr[] of non-negative integers and an integer sum, find a subarray
that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum, print first
such subarray.
Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: Sum found between indexes 1 and 4
Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
Explanation: There is no subarray with 0 sum
*/
import java.util.*;
class Q18SubArraySum{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size=sc.nextInt();
		System.out.println("Enter Array: ");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter sum to find: ");
		int sumf=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				int sum=0;
				for(int k=j;k<=i;k++){
					sum=sum+arr[k];
				}
				if(sum==sumf)
					System.out.println("Sum found between indexex "+j+" and "+i);
			}
		}
	}
}
					
