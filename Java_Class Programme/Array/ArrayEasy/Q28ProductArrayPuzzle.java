/*
 Que 28 : Product Array Puzzle
Given an array nums[] of size n, construct a Product Array P (of same size n) such that
P[i] is equal to the product of all the elements of nums except nums[i].

Example 1:
Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation:
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
Example 2:
Input:
n = 2
nums[] = {12,0}
Output:
0 12
*/
import java.util.*;
class Q28ProducPuzzle{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size=sc.nextInt();
		System.out.println("Enter arry : ");
		int arr[] = new int[size];
		int arr1[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			arr1[i]=1;
		}
		int i=0;
		int j=0;
		int n=size;
		for(int m=1;m<=(size*size);m++){
			if(i!=j){
				arr1[i]=arr1[i]*arr[j];
			}
			j++;
			if(m==n){
				i++;
				j=0;
				n=n+size;
			}
		}
		System.out.println("Output: ");
		for(int k=0;k<arr.length;k++){
                        System.out.print(arr1[k]+" ");
                }
	}
}

			
