/*
 20] Check if pair with given Sum exists in Array (Two Sum)

Given an array A[] of n numbers and another number x, the task is to check
whether or not there exist two elements in A[] whose sum is exactly x.
Examples:
Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation: If we calculate the sum of the output,1 + (-3) = -2
Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No
*/
import java.util.*;
class Q20PairSum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
		System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter requird sum: ");
                int x=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]+arr[j]==x){
					System.out.println("Yes");
					//System.out.println(arr[i]);
					//System.out.println(arr[j]);
				}
			}
		}
	}
}
		
