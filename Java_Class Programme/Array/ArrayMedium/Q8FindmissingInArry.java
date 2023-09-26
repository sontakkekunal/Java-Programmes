/*
 8] Find missing in second array
Given two arrays A and B containing integers of size N and M, the task is to find
numbers which are present in the first array, but not present in the second array.
Example 1:
Input: N = 6, M = 5
A[] = {1, 2, 3, 4, 5, 10}
B[] = {2, 3, 1, 0, 5}
Output: 4 10
Explanation: 4 and 10 are present in first array, but not in second array.
Example 2:
Input: N = 5, M = 5
A[] = {4, 3, 5, 9, 11}
B[] = {4, 9, 3, 11, 10}
Output: 5
Explanation: Second array does not contain element 5.
*/
import java.util.*;
class Q8FinDMissingInArray{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter Second arry: ");
                int size1=sc.nextInt();
                System.out.println("Enter second Array: ");
                int arr1[] = new int[size1];
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
                }
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=0;j<arr1.length;j++){
				if(arr[i]==arr1[j])
					flag=false;
			}
			if(flag)
				System.out.print(arr[i]+" ");
		}
	}
}

