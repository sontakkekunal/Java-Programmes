/*
 28] Remove Duplicates from unsorted array

Given an array of integers which may or may not contain duplicate elements. Your
task is to remove duplicate elements, if present.
Example 1:
Input:
N = 6
A[] = {1, 2, 3, 1, 4, 2}
Output:
1 2 3 4
Example 2:
Input:
N = 4
A[] = {1, 2, 3, 4}
Output:
1 2 3 4
*/
import java.util.*;
class Q28DuplicateInArray{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		int arr1[]=new int[size];
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=0;j<arr.length;j++){
				if(arr[i]!=arr1[j]){
					flag=true;	
				}
				else{
					flag=false;
					break;
				}
			}
			if(flag==true)
				arr1[i]=arr[i];
		}
		System.out.println("After reming dublicate elements are: ");
		for(int i=0;i<arr.length;i++){
			if(arr1[i]!=0)
				System.out.println(arr1[i]);
		}
	}
}
