/*
 7.
Find the Highest number
EasyAccuracy: 46.89%Submissions: 37K+Points: 2
Hiring Challenge for Working Professionals on 10th November.
Apply to 6 Companies through 1 Contest!
banner
Given an array in such a way that the elements stored in array are in increasing
order initially and then after reaching to a peak element, the elements stored are in
decreasing order. Find the highest element.
Note: A[i] != A[i+1]
Example 1:
Input:
11
1 2 3 4 5 6 5 4 3 2 1
Output: 6
Explanation: Highest element is 6.
Example 2:
Input:
5
1 2 3 4 5
Output: 5
Explanation: Highest element is 5.

Expected Time Complexity: O(log(n))
Expected Space Complexity: O(1)
*/
import java.util.Scanner;
class Q7HighestNumInArr{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size=sc.nextInt();
                System.out.println("Enter aray: ");
                int arr[]= new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		int start=0;
		int end=arr.length-1;
		int maxEle=Integer.MIN_VALUE;;
		while(start<=end){
			int mid=(start+((end-start)/2));
			if(arr[mid]>maxEle)
                                maxEle=arr[mid];
			if(maxEle>=arr[mid]){
				start=mid+1;
			}
			if(maxEle<arr[mid])
				end=mid-1;
		}
		System.out.println("maximum in array is : "+maxEle);
	}
}
