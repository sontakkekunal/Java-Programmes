/*
 Que 20 : Bitonic point
Given an array Arr of n elements that is first strictly increasing and then maybe strictly
decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum value.
Example 1:
Input:
n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.

Example 2:
Input:
n = 5
arr[] = {1, 45, 47, 50, 5}
Output: 50
Explanation: Maximum element is 50.
*/
import java.util.*;
class Q20ArrLargest{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[]=new int[size];
		int max=0;
		boolean flag=true;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			if(i==0)
				max=arr[i];
			if(max<arr[i])
				max=arr[i];
			try{
				if(!(arr[i-1]<arr[i]))
					flag=false;
			}catch(ArrayIndexOutOfBoundsException aiobe){
			}
		}
		if(flag)
			System.out.println("Largest element is: "+arr[arr.length-1]);
		else
			System.out.println("Largest element is: "+max);
	}
}
