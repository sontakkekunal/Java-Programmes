import java.util.Scanner;
class InsertionSortRecursion2{
	int  shiftingArr(int arr[],int j,int element){
		if(!(j>=0 && arr[j]>element))
			return j;
		arr[j+1]=arr[j];
		j--;
		return shiftingArr(arr,j,element);
	}
	void insertionSort(int arr[],int n){
		if(n<2)
			return;
		int i=arr.length-n+1;
		//System.out.println(i+ "jjj");
		int element=arr[i];
		int j=i-1;
		j=shiftingArr(arr,j,element);
		arr[j+1]=element;
		insertionSort(arr,n-1);
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
		new InsertionSortRecursion2().insertionSort(arr,size);
		System.out.println("Sorted by insertion sort: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
