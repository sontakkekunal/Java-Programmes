/*
 Q 10.
Given a sorted array of integers, find the starting and ending position of a given
target value.
Write a program to find the range of the target element in the array.
For example, given the array [5, 7, 7, 8, 8, 10] and the target element 8, the
function should return [3, 4], as 8 appears at positions 3 and 4 in the array.
*/
import java.util.Scanner;
class Q10StartEndIndexOfK{
	int[] startEndIndex(int[] arr, int k){
		int start=0;
		int end=arr.length-1;
		int result[]= new int[]{-1,-1};
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==k){
				result[0]=mid;
			}
			if(arr[mid]<k)
				start=mid+1;
			if(arr[mid]>=k)
				end=mid-1;
		}
		start=0;
                end=arr.length-1;
                while(start<=end){
                        int mid=(start+end)/2;
                        if(arr[mid]==k){
                                result[1]=mid;
                        }
                        if(arr[mid]<=k)
                                start=mid+1;
                        if(arr[mid]>k)
                                end=mid-1;
                }
		return result;
	}

	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size=new Integer(sc.nextInt());
                int arr[]= new int[size];
                System.out.println("Enter array: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter target element: ");
                int k=sc.nextInt();
		int result[]=new Q10StartEndIndexOfK().startEndIndex(arr,k);
		System.out.println("Start position and end position of "+k+" is :"+result[0]+" , "+result[1]);
	}
}
