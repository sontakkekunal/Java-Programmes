/*
 Que 18 : Move all zero two the end of Array
Given an array arr[] of N positive integers. Push all the zeros of the given array to the
right end of the array while maintaining the order of non-zero elements.

Example 1:
Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements preserve their order while the 0 elements are
moved to the right.

Example 2:
Input:
N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero element and it gets moved to the left.
*/
import java.util.Scanner;
class Q16RoationFindk{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[]=new int[size];
		int m=arr.length-1;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();

		}
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0 && i<m){
                                int temp=arr[i];
                                arr[i]=arr[m];
                                arr[m]=temp;
                                m--;
                        }
			System.out.print(arr[i]+" ");
		}
	}
}


