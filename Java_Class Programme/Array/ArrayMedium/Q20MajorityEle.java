/*
 20] Majority Element

Given an array A of N elements. Find the majority element in the array. A majority
element in an array A of size N is an element that appears more than or equal to
N/2 times in the array.
Example 1:
Input:
N = 3
A[] = {1,2,3}
Output: -1
Explanation:
Since, each element in
{1,2,3} appears only once so there
is no majority element.
Example 2:
Input:
N = 5
A[] = {3,1,3,3,2}
Output: 3
Explanation:
Since, 3 is present more
than N/2 times, so it is
the majority element.
*/
import java.util.*;
class Q20MajorityEle{
	static int majorityEle(int[] arr){
	       int maj=-1;
	       int n=arr.length;
	       int j=0;
	       int k=0;
	       int cu=0;
	 	int count=0;
	       int len=arr.length;
	       if((((int)(len/2))*2)==len)
		       len=len/2;
	       else
		       len=((int)len/2)+1;
       		for(int i=1;i<=arr.length*arr.length;i++){
			if(arr[j]==arr[k])
				count++;
			if(count>=len){
				if(count>cu){
					maj=arr[j];
					cu=count;
				}
			}
			k++;
			if(i==n){
				count=0;
				n=n+arr.length;
				j++;
				k=0;
			}
		}
		return maj;
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		System.out.println("Enter array : ");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Majority elements is "+Q20MajorityEle.majorityEle(arr));
	}
}
