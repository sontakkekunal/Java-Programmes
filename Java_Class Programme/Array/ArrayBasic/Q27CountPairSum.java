/*
 27] Count pair sum

Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements.
Given a value Sum. The problem is to count all pairs from both arrays whose sum
is equal to Sum.
Note: The pair has an element from each array.
Example 1:
Input:
M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8}
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).
Example 2:
Input:
N=4, M=4, sum=5
arr1[] = {1, 2, 3, 4}
arr2[] = {5, 6, 7, 8}
Output: 0
*/
import java.util.*;
class Q25ProductOfTwoNMax{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
                System.out.println("Enter second Array: ");
                int arr1[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr1[i]=sc.nextInt();
                }
		System.out.println("Enter sum to find: ");
                int sumf=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if((arr[i]+arr1[j])==sumf)
					count++;
			}
		}
		System.out.println("Pairs of "+sumf+" in two array are "+count);
	}
}



