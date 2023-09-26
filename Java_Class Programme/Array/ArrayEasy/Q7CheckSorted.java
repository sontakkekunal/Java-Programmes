/*
 Que 7 : Check if array is sorted
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
*/
import java.util.*;
class Q7CheckSorted{
	static int isSorted(int[] arr){
		int a=0;
		for(int i=0;i<arr.length;i++){
			try{
				if(arr[i]<arr[i+1]);
				else
					a++;
			}catch(ArrayIndexOutOfBoundsException aiobe){
			}
		}
		if(a==0)
			return 1;
		else
			return 0;

	}
        public static void main(String [] args){
                int index=0;
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("array is sorted or not: " +Q7CheckSorted.isSorted(arr));
	}
}
		
