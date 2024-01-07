/*
 Problem Statement 3:
Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
Merge them in sorted order without using any extra space. Modify arr1 so that it
contains the first N elements and modify arr2 so that it contains the last M
elements.
Example 1:
Input:
n = 4, arr1[] = [1 3 5 7]

m = 5, arr2[] = [0 2 6 8 9]
Output:
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two
non-decreasing arrays, we get,
0 1 2 3 5 6 7 8 9.
Example 2:
Input:
n = 2, arr1[] = [10 12]
m = 3, arr2[] = [5 18 20]
Output:
arr1[] = [5 10]
arr2[] = [12 18 20]
Explanation:
After merging two sorted arrays
we get 5 10 12 18 20.
Expected Time Complexity: O((n+m) log(n+m))
Expected Auxiliary Space: O(1)
Constraints:
1 <= n, m <= 10^5
0 <= arr1i, arr2i <= 10^7
 */
import java.util.Scanner;
class Q3TwoArrSortingInSameArrs{
	int partition(int arr[],int start,int end){
		int i=start-1;
		int element =arr[end];
		for(int j=start;j<end;j++){
			if(arr[j]<element){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=element;
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size: ");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter array first: ");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter second array size: ");
		int size2=sc.nextInt();
		int arr2[]= new int[size2];
		System.out.println("Enter array second: ");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
		int i=arr1.length-1;
		int j=0;
		while(arr1[i]>arr2[j]){
			int temp=arr1[i];
			arr1[i]=arr2[j];
			arr2[j]=temp;
			i--;
			j++;
		}
		//System.out.println("here");
		Q3TwoArrSortingInSameArrs obj = new Q3TwoArrSortingInSameArrs();
		obj.quickSort(arr1,0,arr1.length-1);
		obj.quickSort(arr2,0,arr2.length-1);
		System.out.println("Ouput is: ");
		for(int x=0;x<arr1.length;x++){
			System.out.print(arr1[x]+" ");
		}
		System.out.println();
		for(int x=0;x<arr2.length;x++){
                        System.out.print(arr2[x]+" ");
                }
	}
}
