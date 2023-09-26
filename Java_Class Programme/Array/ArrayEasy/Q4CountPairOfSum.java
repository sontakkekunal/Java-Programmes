/*
 Que 4 : Count pairs with given sum
Given an array of N integers, and an integer K, find the number of pairs of elements in
the array whose sum is equal to K.

Example 1:
Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:
Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation:
Each 1 will produce sum 2 with any 1.
*/
import java.util.*;
class Q4ComapirPairSum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
		System.out.println("Enter k : ");
		int k=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int count=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			for(int j=0;j<i;j++){
				if(arr[i]+arr[j]==k)
					count++;
			}
		}
		System.out.println("Number of pair found to form sum "+k+" is "+count);
	}
}

