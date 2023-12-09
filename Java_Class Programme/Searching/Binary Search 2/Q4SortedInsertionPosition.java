/*
 4. Sorted Insert Position
Problem Description :
- Given a sorted array A of size N and a target value B, return the
index
(0-based indexing) if the target is found.
- If not, return the index where it would be if it were inserted in
order.

NOTE:
- You may assume no duplicates in the array.
Problem Constraints :
1 <= N <= 106
Example Input :
Input 1:
A = [1, 3, 5, 6]
B = 5
Output 1: 2
Input 2 :
A = [1, 3, 5, 7]
B = 6
Output 2 : 3
*/
import java.util.Scanner;
class Q4SortedInsertionOrder{
	 public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size=sc.nextInt();
                System.out.println("Enter aray: ");
                int arr[]= new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter targeted elements: ");
		int b=sc.nextInt();
		int start=0;
		int end=arr.length;
		int val=-1;
		int minDiff=Integer.MAX_VALUE;
		while(start<=end){
			int mid=(start+((end-start)/2));
			if(arr[mid]==b){
				val=mid;
				break;
			}
			int count=0;
			int diff=arr[mid]-b;
			if(arr[mid]<b){
				start=mid+1;
				count++;
			}
			if(arr[mid]>b){
				end=mid-1;
			}
			if(diff<0)
				diff= - diff;
			if(diff<minDiff){
				minDiff=diff;
				val=mid +count;
			}
		}
		System.out.println(b +" must be at index: "+val);

	 }
}
