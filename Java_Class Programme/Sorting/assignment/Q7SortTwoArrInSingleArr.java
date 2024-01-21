/*

 Problem Statement 7:
You are given two integer arrays nums1 and nums2, sorted in non-decreasing
order, and two integers m and n, representing the number of elements in nums1 and
nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored
inside the array nums1. To accommodate this, nums1 has a length of m + n, where
the first m elements denote the elements that should be merged, and the last n
elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from
nums1.
Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to
ensure the merge result can fit in nums1.

Constraints:
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 10^9
*/
import java.io.*;
class Q7SortingTwoArrInSingleArr{
	void sortIntSingle(int arr1[],int arr2[]){
		int tempArr[]=new int[arr1.length-arr2.length];
		for(int i=0;i<tempArr.length;i++){
			tempArr[i]=arr1[i];
		}
		int i=0,j=0,k=0;
		while(i<tempArr.length && j<arr2.length){
			if(tempArr[i]<arr2[j]){
				arr1[k]=tempArr[i];
				i++;
			}
			else{
				arr1[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<tempArr.length){
			arr1[k]=tempArr[i];
			i++;
			k++;
		}
		while(j<arr2.length){
			arr1[k]=arr2[j];
			j++;
			k++;
		}
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first array size: ");
		int size1=Integer.parseInt(br.readLine());
		System.out.println("Enter seconnd array size: ");
		int size2=Integer.parseInt(br.readLine());
		size1=size1+size2;
		System.out.println("Enter first  array size: ");
		int arr1[]= new int[size1];
		for(int i=0;i<arr1.length-size2;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter second array size: ");
		int arr2[]= new int[size2];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		new Q7SortingTwoArrInSingleArr().sortIntSingle(arr1,arr2);
		System.out.println("Ouput: ");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+"  ");
		}
	}
}
		

