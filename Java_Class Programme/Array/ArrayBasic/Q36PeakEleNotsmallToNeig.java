/*
 36] Find a peak element which is not smaller than its neighbors
Given an array arr of n elements that is first strictly increasing and then maybe
strictly decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum
value.

Examples:
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less
than 20.
Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less
than 20, similarly 90 has neighbors 23 and 67.
*/
import java.util.*;
class Q36PeakEleInNotSmallToNeig{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			try{
			if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
				System.out.println(arr[i]);
			}
			}catch(ArrayIndexOutOfBoundsException aiobe){
			}
		}
	}
}
