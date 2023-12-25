/*
 12. Stack designer

You are given an array arr of size N. You need to push the elements of the array into a
stack and then print them while popping.
Example 1:
Input:
n = 5
arr = {1 2 3 4 5}
Output:
5 4 3 2 1
Example 2:
Input:
n = 7
arr = {1 6 43 1 2 0 5}
Output:
5 0 2 1 43 6 1
Constraints:
1 <= Ai <= 107
*/
import java.util.Scanner;
import java.util.Stack;
class Q12StackDesign{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter array: ");
		Stack<Integer> s= new Stack<Integer>();
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			s.push(arr[i]);
		}
		System.out.println("Output: ");
		while(!s.empty()){
			System.out.print(s.pop()+" ");
		}
		
	}
}
