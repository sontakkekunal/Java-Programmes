/*
 7] Form largest number from digits

Given an array of numbers from 0 to 9 of size N. Your task is to rearrange elements
of the array such that after combining all the elements of the array, the number
formed is maximum.
Example 1:
Input:
N = 5
A[] = {9, 0, 1, 3, 0}
Output:
93100
Explanation:
Largest number is 93100 which can be formed from array digits.
Example 2:
Input:
N = 3
A[] = {1, 2, 3}
Output:
321
*/
import java.util.*;
class Q7FormLargestNum{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size =sc.nextInt();
		int A[] = new int[size];
		System.out.prinln("Enter array: ");
		for(int i=0;i<A.length;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<i;j++){
				int temp=0;
				if(A[i]>A[j]){
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		int value=0;
		for(int i=0;i<A.length;i++){
			value=value*10+A[i];
                        
                }
		System.out.println("Largset number formed by array is: "+value);

	}
}
