/*
 25] Maximum product of two numbers

Given an array Arr of size N with all elements greater than or equal to zero. Return
the maximum product of two numbers possible.
Example 1:
Input:
N = 6
Arr[] = {1, 4, 3, 6, 7, 0}
Output: 42
Example 2:
Input:
N = 5
Arr = {1, 100, 42, 4, 23}
Output: 4200
*/
import java.util.*;
class Q25ProductOfTwoNMax{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int maxP=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
     			if(arr[i]<0)
				throw new RuntimeException("Enter number larger or equal to zero");
			for(int j=0;j<i;j++){
				if((arr[i]*arr[j])>maxP)
					maxP=arr[i]*arr[j];
			}
		}
		System.out.println("Product of two num at max is: "+maxP);
	}
}
		
