/*
6] Elements in the Range

Given an array arr[] containing positive elements. A and B are two numbers
defining a range. The task is to check if the array contains all elements in the given
range.
Example 1:
Input: N = 7, A = 2, B = 5
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between range 2-5 i.e 2,3,4,5
Example 2:
Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.
Note: If the array contains all elements in the given range then driver code outputs
Yes otherwise, it outputs No
*/
import java.io.*;
class ElementInRange{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size: ");
		int N=Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		System.out.println("Enter first range: ");
		int A=Integer.parseInt(br.readLine());
		System.out.println("Enetr second range: ");
		int B=Integer.parseInt(br.readLine());
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		String str=null;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>A && arr[i]<B)
				str="Yes";
			else{
				str="No";
				break;
			}
		}
		System.out.println("all elements are prseent: "+str);
	}
}

