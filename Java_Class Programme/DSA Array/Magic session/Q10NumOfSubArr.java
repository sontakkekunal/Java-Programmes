/*
 Example 10
You are given an array of size N containing integers. Your task is to find the number of
subarrays that can be formed from the given array. A subarray is defined as a contiguous
sequence of elements in the array.
Input:
arr = [1, 2, 3]
Output:
6
Explanation:
In this example, the possible subarrays are [1], [2], [3], [1, 2], [2, 3], and [1, 2, 3], so the
total count is 6.
*/
import java.util.*;
class Q10NumOfSubArr{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]=new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Num of subarray can form are: "+((N*(N+1))/2));
	}
}
