/*
 Q6.
Find the closest number
BasicAccuracy: 27.1%Submissions: 43K+Points: 1
Hiring Challenge for Working Professionals on 10th November.
Apply to 6 Companies through 1 Contest!
banner
Given an array of sorted integers. The task is to find the closest value to the given
number in array. Array may contain duplicate values.
Note: If the difference is same for two values print the value which is greater than
the given number.
Example 1:
Input : Arr[] = {1, 3, 6, 7} and K = 4
Output : 3
Explanation:
We have an array [1, 3, 6, 7] and target is 4.
If we look at the absolute difference of target
with every element of an array we will
get [ |1-4|, |3-4|, |6-4|, |7-4| ].
So, the closest number is 3.
Example 2:
Input : Arr[] = {1, 2, 3, 5, 6, 8, 9}, K = 4
Output : 5
Expected Time Complexity: O(log(N)).

Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 105
1 ≤ K ≤ 105
1 ≤ A[i] ≤ 105
*/
import java.util.Scanner;
class Q6ClosestNum{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size=sc.nextInt();
                System.out.println("Enter aray: ");
                int arr[]= new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter targeted elements: ");
		int b=sc.nextInt();
		int start=0;
		int end=arr.length;
		int val=-1;
		int minDiff=Integer.MAX_VALUE;
		while(start<=end){
			int mid=(start+((end-start)/2));
			if(arr[mid]==b){
				val=arr[mid];
			}
			int diff=arr[mid]-b;
			if(arr[mid]<b){
				start=mid+1;
			}
			if(arr[mid]>b){
				end=mid-1;
			}
			if(diff<0)
				diff= - diff;
			//System.out.println(diff+ "  "+arr[mid]);
			if(diff<minDiff && arr[mid] >val){
				minDiff=diff;
				val=arr[mid];
			}
		}
		System.out.println("Closest element to "+b+ "is: "+val);

	 }
}
