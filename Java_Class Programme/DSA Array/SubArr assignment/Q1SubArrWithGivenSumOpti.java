/*
 1) Subarray with given sum
Given an unsorted array A of size N that contains only positive integers, find
a continuous sub-array that adds to a given number S and return the left and
right index(1-based indexing) of that subarray.
In case of multiple subarrays, return the subarray indexes which come first
on moving from left to right.
Note:- You have to return an ArrayList consisting of two elements left and
right. In case no such subarray exists, return an array consisting of element
-1.
Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.
Example 2:
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 10^5
0 <= Ai <= 10^9
0<= S <= 10^9
*/
import java.util.Scanner;
class Q1SubArrWithGivenSum{
	static int[] subArrWithSum(int arr[],int N,int s){
		int result[]=new int[]{-1,-1};
                int sum=0;
                int expStart=-1;
		boolean flag=false;
		int a=0;
                for(int i=0;i<N;i++){
                        if(sum==0){
                                expStart=i;
                        }
                        sum=sum+arr[i];
			if(sum>s){
				sum=sum-arr[expStart];
				expStart++;
			}
                        if(sum==s){
                                result[0]=expStart+1;
                                result[1]=i+1;
				flag=true;
                                break;
                        }
                        if(sum<0){
                                sum=0;
                        }
                }
		if(flag)
			return result;
		else
			return new int[]{-1};

	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int N=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]= new int[N];
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter S: ");
		int s=sc.nextInt();
		int result[]=subArrWithSum(arr,N,s);
		System.out.println("Output: ");
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+"  ");
		}
		System.out.println();
	}
}
