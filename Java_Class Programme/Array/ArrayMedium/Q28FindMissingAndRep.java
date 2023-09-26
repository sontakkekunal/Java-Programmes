/*
 28] Find Missing And Repeating

Given an unsorted array Arr of size N of positive integers. One number 'A' from set
{1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two
numbers.
Example 1:
Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and the smallest positive missing
number is 1.

Example 2:
Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and smallest positive missing number
is 2.
*/
import java.util.*;
class Q28FindMissinngRep{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]= new int[size];
		int max=0;
		int min=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(i==0){
				max=arr[i];
				min=arr[i];
			}
			if(arr[i]<=0)
				throw new RuntimeException("Please give positive number");
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Output: ");
		boolean flag=true;
		int val=0;
		
		for(int i=max;i>0;i--){
			boolean flag1=true;
			for(int j=0;j<arr.length;j++){
				if(i==arr[j] ){
					flag1=false;
					break;
				}
			}
			if(flag1){
				val=i;
				flag=false;
			}
		}
		int val1=0;
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					count++;
					break;
				}
			}
			if(count==1){
				val1=arr[i];
			}
		}
		if(flag && min<=1){
			System.out.println(val1+"   "+(++max));
		}
		else
			System.out.println(val1+"   "+val);
	}
}
