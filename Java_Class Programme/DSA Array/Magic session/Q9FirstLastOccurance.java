/*
 Example 9
Given a sorted array arr containing n elements with possibly some duplicate, the task is to find
the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Example 1:
Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:
2 5
Explanation:
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
Example 2:
Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:
6 6
Explanation:
First and last occurrence of 7 is at index 6.
*/
import java.util.*;
class Q9FirstLastOccurance{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]=new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter x: ");
		int x=sc.nextInt();
		boolean flag=true;
		int first=-1;
		int last=-1;
		for(int i=0;i<N;i++){
			if(flag && arr[i]==x){
				first=i;
				flag=false;
			}
			if(arr[i]==x)
				last=i;
		}
		System.out.println("Output: "+ first+"  "+last);
	}
}

