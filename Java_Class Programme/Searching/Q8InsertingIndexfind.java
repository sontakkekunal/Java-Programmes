/*
 Q 8.
Write a program to find the index where a given target element should be inserted
in a sorted array to maintain the array's sorted order.
For example, given the input array sortedArray = [1, 3, 5, 6] and the target element
5, the function should return 2, as 5 is already present at index 2. If the target
element is 2, the function should return 1, as inserting 2 at index 1 would maintain
the sorted order.
*/
import java.util.Scanner;
class Q8InsertingAtIndexFind{
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
		int diff=Integer.MAX_VALUE;
		int start=0;
		int end=arr.length-1;
		int val=-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==k){
				val=mid;
				break;
			}
			int check1=arr[mid]-k;
			if(check1<0)
				check1 = -check1;
			if(check1<diff){
				diff=check1;
				val=mid;
				if(arr[mid]<k)
					val++;
			}
			if(arr[mid]>k){
				end=mid-1;
			}

			if(arr[mid]<k)
				start=mid+1;
		}
		System.out.println("Position must be: "+val);
	}
}
