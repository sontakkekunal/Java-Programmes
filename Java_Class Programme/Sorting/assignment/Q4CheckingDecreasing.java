/*
 Problem Statement 4:
Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.
Example 1:
Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1

Explanation: The given array is sorted.
Example 2:
Input:
N = 6
arr[] = {90, 80, 100, 70, 40, 30}
Output: 0
Explanation: The given array is not sorted.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^5
1 ≤ Arr[i] ≤ 10^6
*/
import java.util.Scanner;
class Q4CheckDecresingSort{
	public static void main(String [] arfs){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++){
			if(!(arr[i]-arr[i+1]<=0)){
				flag=false;
				break;
			}
		}
		System.out.println("Ouput: ");
		if(flag)
			System.out.println(1);
		else 
			System.out.println(0);
	}
}
