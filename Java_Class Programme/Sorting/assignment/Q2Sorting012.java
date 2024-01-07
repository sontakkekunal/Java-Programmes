/*
 Problem Statement 2:
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending
order.
Example 1:
Input:
N = 5
arr[]= {0 2 1 2 0}

Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated
into ascending order.
Example 2:
Input:
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated
into ascending order.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 10^6
0 <= A[i] <= 2
*/
import java.util.Scanner;
class Q2Sorting012{
	public static void main(String [] arfs){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter array: ");
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==0)
				count0++;
			if(arr[i]==1)
				count1++;
			if(arr[i]==2)
				count2++;
		}
		System.out.println("Output is: ");
		for(int i=0;i<arr.length;i++){
			if(count0!=0){
				arr[i]=0;
				count0--;
			}
			else if(count1!=0){
				arr[i]=1;
				count1--;
			}
			else if(count2!=0){
				arr[i]=2;
				count2--;
			}
			System.out.print(arr[i]+"  ");
		}
	}
}



