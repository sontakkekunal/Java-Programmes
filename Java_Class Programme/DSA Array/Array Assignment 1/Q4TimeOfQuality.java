/*
 Q4. Time to equality
Problem Description
- Given an integer array A of size N.
- In one second, you can increase the value of one element by 1.
- Find the minimum time in seconds to make all elements of the array

equal.

Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000

Example Input
A = [2, 4, 1, 3, 2]
Example Output
8

Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8
*/
import java.util.*;
class Q4TimeofQuality{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
		int max=Integer.MIN_VALUE;
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
			if(arr[i]>max)
				max=arr[i];
                }
		int timeCount=0;
		for(int i=0;i<N;i++){
			if(max!=arr[i])
				timeCount=timeCount+(max-arr[i]);
		}
		System.out.println("Minimum time required is: "+timeCount);
	}
}

