import java.util.Scanner;
class InsertionSortRecursion{
	void selectionSort(int arr[],int n){
		int i=arr.length-n;
		//System.out.println(i+"ll");
		if(i>=arr.length-1)
			return;
		int minIndex=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[j]<arr[minIndex])
				minIndex=j;
		}
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
		InsertionSortRecursion obj = new InsertionSortRecursion();
		obj.selectionSort(arr,size);
		System.out.println("Sorted by selection sort: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
