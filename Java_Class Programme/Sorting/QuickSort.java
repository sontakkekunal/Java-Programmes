import java.util.Scanner;
class QuickSort{
	int pivote(int arr[],int start,int end){
		int i=start-1;
		int pivote=arr[end];
		for(int j=start;j<end;j++){
			if(arr[j]<pivote){
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		return i+1;
	}
	void quickSort(int arr[],int start,int end){
		if(start<end){
			int pivoteIndex=pivote(arr,start,end);
			quickSort(arr,start,pivoteIndex-1);
			quickSort(arr,pivoteIndex+1,end);
		}
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
		new QuickSort().quickSort(arr,0,arr.length-1);
		System.out.println("Sorted by insertion sort: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
