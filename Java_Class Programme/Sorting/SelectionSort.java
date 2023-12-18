import java.util.Scanner;
class SelectionSort{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++){
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		System.out.println("Sorted by selection sort: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
