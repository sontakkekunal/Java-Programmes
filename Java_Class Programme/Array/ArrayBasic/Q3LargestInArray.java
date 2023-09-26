/*
 3] Largest Element in Array

Given an array A[] of size n. The task is to find the largest element in it.
Example 1:
Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output: 90
Explanation:
The largest element of a given array is 90.
Example 2:
Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output: 5
Explanation:
The largest element of a given array is 5.
 */
import java.io.*;
class Q3LargerNum{
        public static void main(String [] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter array size: ");
                int size=Integer.parseInt(br.readLine());
                int arr[]= new int[size];
                System.out.println("Enter array number: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
                int value=arr[0];
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>value)
                                value=arr[i];
                }
		System.out.println("Largest element in array: "+value);
	}
}
