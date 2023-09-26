/*
 Que 27 : Remove Duplicate Elements from sorted Array
Given a sorted array A[] of size N, delete all the duplicate elements from A[]. Modify the
array such that if there are X distinct elements in it then the first X positions of the array
should be filled with them in increasing order and return the number of distinct elements
in the array.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the number of distinct elements(X) in the array, the driver code will
print all the elements of the modified array from index 0 to X-1 as output of your code.
Example 1:
Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates only one instance of 2 will remain
i.e. {2} so modify array will contain 2 at first position and you should return 1
after modify the array.
Example 2:
Input:
N = 4
Array = {1, 2, 2, 4}
Output: 1 2 4
Explanation: After removing all duplicates, the modified array will contain {1, 2,
4} at first 3 positions so you should return 3 after modifying the array.
*/
import java.util.*;
class Q27DuplicateInArray{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					arr[j]=0;
				}
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("output: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)
				System.out.println(arr[i]+" ");
		}
	}
}
