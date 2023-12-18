import java.util.Scanner;
class SelectionSortRecursion2{
	int selection(int arr[],int j,int minIndex){
		if(j>=arr.length)
			return minIndex;
		if(arr[j]<arr[minIndex])
			minIndex=j;
		j++;
		return selection(arr,j,minIndex);
	}
	void selectionSort(int arr[],int n){
		int i=arr.length-n;
		if(i>=arr.length-1)
			return;
		int minIndex=i;
		minIndex=selection(arr,i+1,minIndex);
		int temp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;
		selectionSort(arr,n-1);
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
		SelectionSortRecursion2 obj= new SelectionSortRecursion2();
		obj.selectionSort(arr,size);
		System.out.println("Sorted by selection sort: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
