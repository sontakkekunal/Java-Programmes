/*
Search an Element in an array

Given an integer array and another integer element. The task is to find if the given
element is present in the array or not.
Example 1:
Input:
n = 4
arr[] = {1,2,3,4}
x = 3
Output: 2
Explanation: There is one test case with an array as {1, 2, 3 4} and an
element to be searched as 3. Since 3 is present at index 2, output is 2.
Example 2:
Input:
n = 5
arr[] = {1,2,3,4,5}
x = 5
Output: 4
Explanation: For array elements {1,2,3,4,5} element to be searched is 5 and
it is at index 4. So, the output is 4.
*/
import java.util.*;
class SearchElement{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		System.out.println("Enter arry: ");
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter search elemrnt: ");
		int searchEle=sc.nextInt();
		for(int i=0;i<size;i++){
			if(arr[i]==searchEle){
				System.out.println("element "+searchEle+" found at index "+i);
			}
		}
	}
}
