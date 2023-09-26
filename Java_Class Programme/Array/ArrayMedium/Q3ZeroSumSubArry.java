/*
 3] Zero Sum Subarrays
You are given an array arr[] of size n. Find the total count of sub-arrays having
their sum equal to 0.
Example 1:
Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are
[0], [0], [0], [0], [0,0], and [0,0].
Example 2:
Input:
n = 10
arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4]
[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
*/
import java.util.*;
class Q3ZeroSumSubArry{
        public static void main(String [] args){
		int index=0;
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int count=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                	for(int j=0;j<=i;j++){
				int sum=0;
				for(int k=j;k<=i;k++){
					sum=sum+arr[k];

				}
				if(sum==0)
					count++;				
			}
		}
		System.out.println("No. of subArray that sum is zero are: "+count);
	}
}
