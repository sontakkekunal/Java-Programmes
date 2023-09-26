/*
 9] K-th element of two Arrays

Given two arrays arr1 and arr2 of size N and M respectively and an element K. The
task is to find the element that would be at the kth position of the final sorted array.
Example 1:
Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output: 6
Explanation:
The final sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
Example 2:
Input:
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445}
k = 7
Output: 256
Explanation:
Final sorted array is - 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770
7th element of this array is 256.
*/
import java.util.*;
class Q9KthEleInArray{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter Second arry: ");
                int size1=sc.nextInt();
                System.out.println("Enter second Array: ");
                int arr1[] = new int[size1];
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
                }
		System.out.println("Enter k : ");
		int x=sc.nextInt();
		int arr2[]=new int[arr.length+arr1.length];
		int j=0;
		int k=0;
		System.out.println("Output: ");
		for(int i=0;i<arr2.length;i++){
			if(i<arr.length){
				arr2[i]=arr[j];
				j++;
			}
			else{
				arr2[i]=arr1[k];
				k++;
			}
			
			for(int m=0;m<i;m++){
				if(arr2[i]<arr2[m]){
					int temp=arr2[i];
					arr2[i]=arr2[m];
					arr2[m]=temp;
				}
			}
		}
		for(int i=0;i<arr2.length;i++){
			if(i==(x-1))
				System.out.println(arr2[i]);
		}
	}
}
