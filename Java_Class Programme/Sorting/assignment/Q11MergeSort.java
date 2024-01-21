/*
Problem statement 11:
Given an array arr[], its starting position l and its ending position r. Sort the array
using the Merge Sort algorithm and also solve using the Quick Sort algorithm.
Example 1:
Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:
Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:

1 2 3 4 5 6 7 8 9 10
Expected Time Complexity: O(nlogn)
Expected Auxiliary Space: O(n)
Constraints:
1 <= N <= 10^5
1 <= arr[i] <= 10^5
*/
import java.util.Scanner;
class Q11MergeSort{
	void merge(int arr[],int start,int mid,int end){
		int arr1[]=new int[mid-start+1];
		int arr2[]= new int[end-mid];
		int n=start;
		for(int i=0;i<arr1.length;i++){
			arr1[i]=arr[n];
			n++;
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr[n];
			n++;
		}
		int i=start,j=0,z=0;
		while(j<arr1.length && z<arr2.length){
			if(arr1[j]<arr2[z]){
				arr[i]=arr1[j];
				j++;
			}
			else{
				arr[i]=arr2[z];
				z++;
			}
			i++;
		}
		while(j<arr1.length){
			arr[i]=arr1[j];
			j++;
			i++;
		}
		while(z<arr2.length){
			arr[i]=arr2[z];
			z++;
			i++;
		}

	}
	void mergeSort(int arr[],int start,int end){
		if(start<end){
			int mid=start+((end-start)/2);
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter size: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		new Q11MergeSort().mergeSort(arr,0,arr.length-1);
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}

	}
}
