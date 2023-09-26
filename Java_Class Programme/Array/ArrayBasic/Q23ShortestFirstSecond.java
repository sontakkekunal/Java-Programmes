/*
 23] Find the smallest and second smallest element in an array

Given an array of integers, your task is to find the smallest and second smallest
element in the array. If smallest and second smallest do not exist, print -1.
Example 1:
Input :
5
2 4 3 5 6
Output :
2 3
Explanation:
2 and 3 are respectively the smallest
and second smallest elements in the array.
Example 2:
Input :
6
1 2 1 3 6 7
Output :
1 2
Explanation:
1 and 2 are respectively the smallest
and second smallest elements in the array.
*/
import java.util.*;
class Q23ShoetesSeconfFirst{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int min1=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			if(i==0)
				min1=arr[i];
			if(min1>arr[i])
				min1=arr[i];
                }
		int min2=0;
		for(int i=0;i<arr.length;i++){
			if(i==0)
				min2=arr[i];
			if(arr[i]!=min1 && min2>arr[i]){
				min2=arr[i];
			}
			if(min2==min1)
				min2=arr[i+1];
		}
		System.out.println("First element minmum : "+min1);
		System.out.println("Second smallest element: "+min2);
	}
}

