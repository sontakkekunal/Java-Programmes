/*
 15] Sum of distinct elements

You are given an array Arr of size N. Find the sum of distinct elements in an array.
Example 1:
Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 15
Explanation: Distinct elements are 1, 2, 3
4, 5. So the sum is 15.
Example 2:
Input:
N = 5
Arr[] = {5, 5, 5, 5, 5}
Output: 5
Explanation: Only Distinct element is 5.
So the sum is 5.
*/
import java.util.*;
class Q15SumofDistant{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size =sc.nextInt();
                int A[] = new int[size];
                System.out.println("Enter array: ");
                for(int i=0;i<A.length;i++){
			A[i]=sc.nextInt();
		}
		int arr[]=new int[A.length];
		arr[0]=A[0];
		for(int i=0;i<A.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[j]!=A[i] && arr[j]!=arr[i]){
					arr[i]=A[i];
				}
			}
		}
		System.out.println("Sum of Distint element is: ");
		int sum=0;
		for(int i=0;i<A.length;i++){
			if(arr[i]!=0)
                        	sum=sum+arr[i];
                }
		System.out.println(sum);
	}
}
