/*
 Problem 2:
Given an array of non-negative integers representing a number, implement a function to
simulate the carry forward operation that occurs when adding 1 to the number represented by
the array. The array represents the digits of the number, where the 0th index is the least
significant digit. Your task is to handle the carry forward operation correctly, updating the array
accordingly. The function should return the resulting array.
For example, given the input array [1, 9, 9], representing the number 199, the function should
return [2, 0, 0], representing the result of adding 1 to 199 with the carry forward properly
handled.
Consider edge cases such as when the number has trailing zeros or when the carry forward
results in an additional digit. Optimize your solution for efficiency and discuss the time and
space complexity of your algorithm.
 */
import java.util.*;
class Q2Conversion{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]=new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int val=0;
		for(int i=0;i<N;i++){
			int temp=arr[i];
			while(temp!=0){
				val=val*10;
				temp=temp/10;
			}
			val=val+arr[i];
		}
		val=val+1;
		System.out.println("Output: ");
		int arr1[]= new int[(""+val).length()];
		for(int i=arr1.length-1;i>=0;i--){
			arr1[i]=val%10;
			val=val/10;
		}
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
	}
}
