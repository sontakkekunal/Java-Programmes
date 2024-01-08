/*
 Problem Statement 6:
Given a random set of numbers, Print them in sorted order.
Example 1:
Input:
N = 4

arr[] = {1, 5, 3, 2}
Output: {1, 2, 3, 5}
Explanation: After sorting array will
be like {1, 2, 3, 5}.
Example 2:
Input:
N = 2
arr[] = {3, 1}
Output: {1, 3}
Explanation: After sorting array will
be like {1, 3}.
Expected Time Complexity: O(N * log N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N, A[i] ≤ 105
*/
import java.util.Scanner;
class Q6QuickSort{
	int partition(int arr[],int start,int end){
		int i=start-1;
		int pivote=arr[end];
		for(int j=start;j<end;j++){
			if(arr[j]<pivote){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=pivote;
		arr[end]=temp;
		return i+1;
	}
	void quickSort(int arr[],int start,int end){
		if(start<end){
			int pivote=partition(arr,start,end);
			quickSort(arr,start,pivote-1);
			quickSort(arr,pivote+1,end);
		}
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		new Q6QuickSort().quickSort(arr,0,arr.length-1);
		System.out.println("Ouput is: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
