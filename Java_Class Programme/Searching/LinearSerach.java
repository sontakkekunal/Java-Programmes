import java.util.Scanner;
class LinearSearch{
	int linearSearch(int arr[],int search){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==search)
				return i;
		}
		return -1;
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
		int x=new LinearSearch().linearSearch(arr,search);
		if(x==-1)
			System.out.println("Element not found in the array");
		else
			System.out.println("element found at index: "+x);
	}
}
