/*
 Q2. Linear Search - Multiple Occurences
Problem Description
Given an array A and an integer B, find the number of occurrences

of B in A.

Problem Constraints
1 <= B, Ai <= 109
1 <= length(A) <= 105

Example Input
Input 1:
A = [1, 2, 2], B = 2
Input 2:
A = [1, 2, 1], B = 3

Example Output
Output 1:
2
Output 2:
0

Example Explanation
Explanation 1:
Element at index 2, 3 is equal to 2 hence count is 2.
Explanation 2:
There is no element equal to 3 in the array.
*/
import java.util.*;
class Q2MutipleOccurance{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
		}
		System.out.println("Enter B");
		int b=sc.nextInt();
		int count=0;
		for(int i=0;i<N;i++){
                	if(b==arr[i])
				count++;
		}
		System.out.println("Occurance of B in array is: "+count);
	}
}
