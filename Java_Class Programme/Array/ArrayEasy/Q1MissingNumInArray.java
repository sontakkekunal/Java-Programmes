/*
 Que 1 : Missing number in array
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to
N. Find the missing element.

Example 1:
Input:
N = 6
A[] = {1,2,4,5,6}
Output: 3

Example 2:
Input:
N = 11
A[] = {1,3,2,5,6,7,8,11,10,4}
Output: 9
*/
import java.util.Scanner;
class Q1MissingNumInArray{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size=sc.nextInt();
		System.out.println("Enter Array: ");
		int arr[] = new int[size];
		int min=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(i==0){
				min=arr[i];
				max=arr[i];
			}
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		while(min!=max){
			boolean flag=false;
			for(int i=0;i<arr.length;i++){
				if(min==arr[i]){
					flag=true;
					break;
				}
			}
			if(flag==false){
				System.out.println("Output: "+min);
			}
			min++;
		}
	}
}

					
			

