/*
 Problem Statement 5:
Given an array arr[], its starting position l and its ending position r. Sort the array
using the Merge Sort algorithm.
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
*/
import java.util.Scanner;
class Q5MergeSort{
	void mergeArr(int arr[],int start,int mid,int end){
		int arr1[]= new int[mid-start+1];
		int arr2[]=new int[end-mid];
		int x=start;
		for(int i=0;i<arr1.length;i++){
			arr1[i]=arr[x];
			x++;
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr[x];
			x++;
		}
		int i=start;
		int j=0;
		int k=0;
		i=start;
		while(j<arr1.length && k<arr2.length){
			if(arr1[j]>arr2[k]){
				arr[i]=arr2[k];
				k++;
			}
			else{
				arr[i]=arr1[j];
				j++;
			}
			i++;
		}
		while(j<arr1.length){
			arr[i]=arr1[j];
			j++;
			i++;
		}
		while(k<arr2.length){
			arr[i]=arr2[k];
			k++;
			i++;
		}
	}
	void mergeSort(int arr[],int start,int end){
		if(start<end){
			int mid=start+((end-start)/2);
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			mergeArr(arr,start,mid,end);
	
		}
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		new Q5MergeSort().mergeSort(arr,0,arr.length-1);
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
