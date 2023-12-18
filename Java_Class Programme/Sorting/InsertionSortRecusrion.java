import java.util.Scanner;
class InsertionSortRecursion{
	void insertionSort(int arr[],int n){
		if(n<1)
			return;
		int i=arr.length-n;
		int element=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>element){
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=element;
		insertionSort(arr,--n);
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted by insertion sort: ");
		InsertionSortRecursion obj= new InsertionSortRecursion();
		obj.insertionSort(arr,size-1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
