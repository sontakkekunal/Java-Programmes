/*
 Que 14 : Intersection of two Array
Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of
elements in the intersection (or common elements) of the two arrays.
For this question, the intersection of two arrays can be defined as the set containing
distinct common elements between the two arrays.
Example 1:
Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}
Output: 1
Explanation:
89 is the only element in the intersection of two arrays.

Example 2:
Input:
n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 6}
b[] = {3, 4, 5, 6, 7}
Output: 4
Explanation:
3 4 5 and 6 are the elements in the intersection of two arrays.
*/
import java.util.*;
class Q14IntersectionArray{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
		System.out.println("Enter Second Array size: ");
                int size1=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter second Array: ");
                int arr1[] = new int[size1];
		int count=0;
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
                	for(int j=0;j<arr.length;j++){
				if(arr1[i]==arr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println("Output: "+count);
	}
}
