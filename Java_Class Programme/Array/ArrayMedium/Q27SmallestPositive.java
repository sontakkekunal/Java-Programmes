/*
 27] Smallest Positive missing number
You are given an array arr[] of N integers. The task is to find the smallest positive
number missing from the array.
Note: Positive number starts from 1.

Example 1:
Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing
number is 6.
Example 2:
Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2
Explanation: Smallest positive missing
number is 2.
*/
import java.util.*;
class Q27SmallestPositive{
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
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		if(max<=0){
			System.out.println("Test case invaild for given question");
			System.exit(0);
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
		if(flag && min<=1){
			System.out.println(++max);
		}
		else
			System.out.println(val);
	}
}
