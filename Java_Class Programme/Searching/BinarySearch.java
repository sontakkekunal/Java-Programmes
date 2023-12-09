//binary serch only works on the sorted array
import java.util.Scanner;
class BinarySearch{
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
		int x=-1;
		while(start<=end){
			int mid=(start +((end-start)/2));
			if(arr[mid]==search){
				x=mid;
				break;
			}
			if(arr[mid]>search)
				end=mid-1;
			if(arr[mid]<search)
				start=mid+1;
		}
		if(x==-1)
                        System.out.println("Element not found in the array");
                else
                        System.out.println("element found at index: "+x);


	}
}
