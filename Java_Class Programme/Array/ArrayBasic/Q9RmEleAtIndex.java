/*
 9] Remove an Element at Specific Index from an Array
Given an array of a fixed length. The task is to remove an element at a specific
index from the array.
Examples 1:
Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
Output: arr[] = { 1, 2, 4, 5 }
Examples 2:
Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
Output: arr[] = { 4, 5, 9, 1 }
*/
import java.util.*;
class Q9RmEleAtIndex{
	public static void main(String [] args){
                boolean flag=false;
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size =sc.nextInt();
                int A[] = new int[size];
                System.out.println("Enter array: ");
                for(int i=0;i<A.length;i++){
                        A[i]=sc.nextInt();
                }
		System.out.println("Enter index to rmove: ");
		int index=sc.nextInt();
		int arr[]= new int[size-1];
		int m=0;
		System.out.println("After removingg element at "+index+" the arry is : ");
		for(int i=0;i<arr.length;i++){
			if(index==m){
				m++;
				
			}
			arr[i]=A[m];
			m++;
			System.out.println(arr[i]);
		}
	}
}
		
