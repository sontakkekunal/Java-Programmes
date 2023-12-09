import java.util.Scanner;
class LinearSearch{
	int i=0;
	int linearSearch(int i,int arr[],int search){
		if(i>=arr.length)
			return -1;
		if(search==arr[i])
			return i;
		i++;
		return linearSearch(i,arr,search);
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
		int x=new LinearSearch().linearSearch(0,arr,search);
		if(x==-1)
			System.out.println("Element not found in the array");
		else
			System.out.println("element found at index: "+x);
	}
}
