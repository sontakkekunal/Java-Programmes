/*
 Problem 8
Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction)
by D steps, where D is a positive integer.

Example 1:
Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5 when rotated
by 2 elements, it becomes 3 4 5 1 2.

Example 2:
Input:
N = 10, D = 3
arr[] = {2,4,6,8,10,12,14,16,18,20}
Output: 8 10 12 14 16 18 20 2 4 6
Explanation: 2 4 6 8 10 12 14 16 18 20
when rotated by 3 elements, it becomes
8 10 12 14 16 18 20 2 4 6.
 */
import java.util.*;
class Q8LeftRotateArr{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]=new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter D: ");
		int D=sc.nextInt();
		for(int i=0;i<D;i++){
			int swap=arr[0];
			for(int j=N-1;j>=0;j--){
				int temp=arr[j];
				arr[j]=swap;
				swap=temp;
			}
		}
		System.out.println("Output: ");
		for(int i=0;i<N;i++){
			System.out.println(arr[i]);
		}
	}
}


