/*
 Q 5.
Implement binary search to find the element closest to a given target in a sorted
array.

For example, given the input array arr = [1, 2, 4, 7, 9] and the target element 6, the
function should return 7, as 7 is the closest element to 6 in the array.
*/
import java.util.Scanner;
class Q6ClosetSearchinArr{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[] = new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter element for seraching its cloaset occrance; ");
                int search=sc.nextInt();
                int start=0;
                int end=arr.length-1;
                int val=-1;
		int minDist=Integer.MAX_VALUE;
                while(start<=end){
                        int mid=(start+end)/2;
			int dist=search-arr[mid];
			if(dist<0)
				dist = -dist;
			if(dist<minDist){
				minDist=dist;
				val=arr[mid];
			}
                        if(arr[mid]==search)
                                val=mid;
                        if(arr[mid]>search)
                                end=mid-1;
                        if(arr[mid]<search)
                                start=mid+1;
                }
                System.out.println("Closest occurance of "+search+" found at index: "+val);

	}
}
