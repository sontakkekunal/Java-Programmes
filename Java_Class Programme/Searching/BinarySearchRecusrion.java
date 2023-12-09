import java.util.Scanner;
class RecursionBinarySearch{
	int recsursioBinarySearch(int start,int end,int arr[],int search){
		if(start>end)
			return -1;
		int mid=start+((end-start)/2);
		if(arr[mid]==search)
			return mid;
		if(arr[mid]>search)
			end=mid-1;
		if(arr[mid]<search)
			start=mid+1;
		return recsursioBinarySearch(start,end,arr,search);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size=sc.nextInt();
                int arr[]= new int[size];
                System.out.println("Enter array: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter element to search: ");
                int search=sc.nextInt();
                int start=0;
                int end=arr.length-1;
		int x= new RecursionBinarySearch().recsursioBinarySearch(start,end,arr,search);
		if(x==-1)
                        System.out.println("Element not found in the array");
                else
                        System.out.println("element found at index: "+x);
	}
}

