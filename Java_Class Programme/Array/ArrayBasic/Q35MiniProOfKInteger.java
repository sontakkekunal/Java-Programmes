/*
 35] Minimum Product of k Integers
Given an array of N positive integers. You need to write a program to print the
minimum product of k integers of the given array.
Note: Since output could be large, hence module 10^9+7 and then print answer.
Example 1:
Input : Arr[] = {1, 2, 3, 4, 5}, K = 2
Output : 2
Explanation:
If we have an array [1, 2, 3, 4, 5]. We will get the minimum product after
multiplying 1 and 2 that is 2.
So, the answer is 2.
Example 2:
Input : Arr[] = {9, 10, 8}, K = 3
Output : 720
*/
import java.util.*;
class Q35MinProOfkIntger{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		System.out.println("Eneter k integerty: ");
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int product=1;
		for(int i=0;i<=k-1;i++){
			product=product*arr[i];
		}
		System.out.println("Output: "+product);
	}
}


