/*
 12] First and last occurrences of X
Given a sorted array having N elements, find the indices of the first and last
occurrences of an element X in the given array.
Note: If the number X is not found in the array, return '-1' as an array.
Example 1:
Input:
N = 4 , X = 3
arr[] = { 1, 3, 3, 4 }
Output:
1 2
Explanation:
For the above array, first occurance of X = 3 is at index = 1 and last
occurrence is at index = 2.

Example 2:
Input:
N = 4, X = 5
arr[] = { 1, 2, 3, 4 }
Output:
-1
Explanation:
As 5 is not present in the array, so the answer is -1.
*/
import java.util.*;
class Q12FirstLastOccuIndex{
	static String firstLastIndex(int[] arr,int search){
		boolean checl1=false;
		boolean checl2=false;
		int v1=0;
		int v2=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==search){
				v1=i;
				checl1=true;
				break;
			}
		}
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==search){
				v2=i;
				checl2=true;
				break;
			}
		}
		if(checl1 && checl2)
			return "First element at index "+v1+" \nLast element at index "+v2;
		else if(checl1 && checl2==false)
			return "First element at index "+v1;
		else if(checl1==false && checl2)
			return "Last element at index "+v2;
		else
			return "-1";
	}
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size =sc.nextInt();
                int A[] = new int[size];
                System.out.println("Enter array: ");
		for(int i=0;i<A.length;i++){
			A[i]=sc.nextInt();
		}
		System.out.println("Enter element to search its index at first and last: ");
		int search=sc.nextInt();

		System.out.println(Q12FirstLastOccuIndex.firstLastIndex(A,search));
	}
}
