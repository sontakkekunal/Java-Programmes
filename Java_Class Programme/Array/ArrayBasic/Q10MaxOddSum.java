/*
 10] Max Odd Sum

Given an array of integers, check whether there is a subsequence with odd sum and
if yes, then find the maximum odd sum. If no subsequence contains an odd sum,
print -1.
Example 1:
Input:
N=4
arr[] = {4, -3, 3, -5}
Output: 7
Explanation:
The subsequence with maximum odd
sum is 4 + 3 = 7
Example 2:
Input:
N=5
arr[] = {2, 5, -4, 3, -1}
Output: 9
Explanation:
The subsequence with maximum odd
sum is 2 + 5 + 3 + -1 = 9
*/
import java.util.*;
class Q10MaxOddSum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size =sc.nextInt();
                int A[] = new int[size];
                System.out.println("Enter array: ");
		int value=0;
                for(int i=0;i<A.length;i++){
                        A[i]=sc.nextInt();
			if(A[i]%2==1)
				value=value+A[i];
                }
		System.out.println("The subsequence with maximum odd sum is: "+value);
	}
}
		

