/*
 Problem Statement 1:
Given an Integer N and a list arr. Sort the array using bubble sort algorithm.
Example 1:
Input:
N = 5
arr[] = {4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Example 2:
Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10
Expected Time Complexity: O(N^2).
Expected Auxiliary Space: O(1).
Constraints:
1 <= N <= 10^3
1 <= arr[i] <= 10^3
*/
import java.util.Scanner;
class Q1BubbleAlgo{
	public static void main(String [] arfs){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("After sorting: ");
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=0;j<arr.length-1-i;j++){
				cnt++;
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag)
				break;
		}
		System.out.println("Output is: "); 
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"  ");
                }
		System.out.println("\n Iteration required is: "+cnt);
	}
}
