/*
 Q1.WAP for binary search using recursion as well as while loop approach.
 */
class Q1BinarySearch{
	public static void main(String [] args){
		int arr[]= new int[]{1,2,4,5,7,8,10,13,15};
		int search =13;
		int start=0;
		int end=arr.length-1;
		int val=-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==search){
				val=mid;
				break;
			}
			if(arr[mid]<search)
				start=mid+1;
			if(arr[mid]>search)
				end=mid-1;
		}
		System.out.println("Index found at index: "+val);
	}
}
