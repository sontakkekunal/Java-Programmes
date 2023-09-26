/*
 Que 8 : Rotate Array
Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise
direction) by D steps, where D is a positive integer.

Example 1:
Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5 when rotated
by 2 elements, it becomes 3 4 5 1 2.

Example 2:
Input:
N = 10, D = 3
arr[] = {2,4,6,8,10,12,14,16,18,20}
Output: 8 10 12 14 16 18 20 2 4 6
Explanation: 2 4 6 8 10 12 14 16 18 20
when rotated by 3 elements, it becomes
8 10 12 14 16 18 20 2 4 6.
*/
import java.util.Scanner;
class Q8RoationArray{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter D steps: ");
		int d=sc.nextInt();
		int temp1=0;
                for(int x=0;x<d;x++){
			for(int i=arr.length-1;i>=0;i--){
				int temp=temp1;
				temp1=arr[i];
				arr[i]=temp;
				if(i==0){
					arr[arr.length-1]=temp1;
				}
			}
		}
		System.out.println("Output is : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		
		}
	}
}



			


