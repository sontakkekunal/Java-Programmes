/*
 3. Single Element in Sorted Array
Problem Description :
- Given a sorted array of integers A where every element appears twice
except for one element which appears once, find and return this single element that
appears only once.
Problem Constraints :
1 <= |A| <= 100000
1 <= A[i] <= 10^9
Example Input :
Input 1:
A = [1, 1, 7]
Output 1: 7

Input 2:
A = [2, 3, 3]
Output 2: 2
*/
import java.util.Scanner;
class Q3SingleEleInSortedArr{
	int singleEleInSortArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			int start=0;
			int end=arr.length-1;
			int val1=-1;
			while(start<=end){
				int mid=(start)+((end-start)/2);
				if(arr[mid]==arr[i]){
					val1=mid;
				}
				if(arr[mid]<=arr[i])
					start=mid+1;
				if(arr[mid]>arr[i])
					end=mid-1;
			}
			int val2=-1;
			start=0;
                        end=arr.length-1;
			while(start<=end){
                                int mid=(start)+((end-start)/2);
                                if(arr[mid]==arr[i]){
                                        val2=mid;
                                }
                                if(arr[mid]<arr[i])
                                        start=mid+1;
                                if(arr[mid]>=arr[i])
                                        end=mid-1;
                        }
			if(val1==val2 && val1!=-1)
				return arr[val1];
		}
		return -1;

	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		System.out.println("Enter aray: ");
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("the single elements in array : "+new Q3SingleEleInSortedArr().singleEleInSortArr(arr));
	}
}
