/*
 Q1.WAP for binary search using recursion as well as while loop approach.
 */
class Q1BinarySearch{
	int binarySearch(int num1,int num2,int search,int arr[]){
		if(num1>num2)
			return -1;
		int mid=(num1+num2)/2;
		if(arr[mid]==search)
			return mid;
		if(arr[mid]>search)
			num2=mid-1;
		if(arr[mid]<search)
			num1=mid+1;
		return binarySearch(num1,num2,search,arr);
	}
        public static void main(String [] args){
                int arr[]= new int[]{1,2,4,5,7,8,10,13,15};
                int search =2;
		int num1=0;
		int num2=arr.length-1;
		System.out.println("Index found at index: "+new Q1BinarySearch().binarySearch(num1,num2,search,arr));
	}
}

