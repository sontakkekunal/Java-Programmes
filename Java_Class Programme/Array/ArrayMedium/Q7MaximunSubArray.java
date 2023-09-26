/*
 7] Maximum Subarray
Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be contiguous i.e., a sub-array created by choosing the
second and fourth element and skipping the third element is invalid.
Maximum sub-array is defined in terms of the sum of the elements in the sub-array.
Sub-array A is greater than sub-array B if sum(A) > sum(B).
Example:
a = [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]
NOTE: If there is a tie, then compare the segment's length and the return segment
which has the maximum length.
If there is still a tie, then return the segment with the minimum starting index.
If no such subarray is present return "-1"
Example 1:
Input:
n = 3
a[] = {1, 2, 3}
Output: 1 2 3
Explanation: In the given array every element is non-negative.
Example 2:
Input:
n = 2
a[] = {-1, 2}
Output: 2
Explanation: The only subarray [2] is the answer.
*/
import java.util.*;
class Q7MaxSubArray{
	int[] maxSubArray(int[] arr){
		int sumf=-1;
		boolean flag=true;
		int diff=0;
		int count=0;
		int m=0;
		int n=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0)
				continue;
			for(int j=0;j<=i;j++){
				int sum=0;
				if(arr[j]<0)
					continue;
				for(int k=j;k<=i;k++){
					sum=sum+arr[k];
				}
				if(flag){
					sum=sumf;
					flag=false;
				}
				if(sum==sumf){
					count++;
					if(diff<(i-j))
						diff=i-j;
				}
				if(sum>sumf){
					sumf=sum;
					m=i;
					n=j;
					diff=i-j;
				}
			}
		}
		if(sumf==0){
			return new int[]{-1};
		}
		else if(count<2){
			int arr1[]=new int[m-n+1];
                        for(int i=0;i<arr1.length;i++){
                                arr1[i]=arr[n];
				n++;
			}	
                        return arr1;
		}
		else{
			return new int[]{n};
		}
	}


	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		Q7MaxSubArray obj = new Q7MaxSubArray();
		int[] arr2=obj.maxSubArray(arr);
		System.out.println("LargestSubset is: ");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}


