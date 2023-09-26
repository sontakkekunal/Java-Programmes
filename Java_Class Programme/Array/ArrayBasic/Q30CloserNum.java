/*
 30] Find the closest number

Given an array of sorted integers. The task is to find the closest value to the given
number in the array. Arrays may contain duplicate values.
Note: If the difference is same for two values print the value which is greater than
the given number.
Example 1:
Input : Arr[] = {1, 3, 6, 7} and K = 4
Output : 3
Explanation:
We have an array [1, 3, 6, 7] and the target is 4. If we look at the absolute
difference of target with every element of an array we will get [ |1-4|, |3-4|,
|6-4|, |7-4| ].
So, the closest number is 3.
Example 2:
Input : Arr[] = {1, 2, 3, 5, 6, 8, 9}, K = 4
Output : 5
*/
import java.util.*;
class Q30CloserNum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enetr k value: ");
		int k=sc.nextInt();
		int value=0;
		int diff1=0;
		for(int i=0;i<arr.length;i++){
			int diff=0;
			if(arr[i]>k){
				diff=arr[i]-k;
			}
			else if(arr[i]<k){
				diff=k-arr[i];
			}
			else
				diff=0;
			if(i==0)
				diff1=diff;
			if(diff<=diff1){
				diff1=diff;
				value=arr[i];
			}
			//System.out.println(diff+" " +arr[i]+"  "+value);
		}
		System.out.println("Closer value is: "+value);
	}
}

