import java.util.Scanner;
class MergeSort{
	void sort(int arr[],int start,int mid,int end){
		int arr1[]= new int[mid-start+1];
		int arr2[]= new int[end-mid];

	//	System.out.println("First array");
		int n1=start;
		for(int x=0;x<arr1.length;x++){
			arr1[x]=arr[n1];
			//System.out.println(arr1[x]);
			n1++;
		}
		int n2=mid+1;
	//	System.out.println("second array");
		for(int x=0;x<arr2.length;x++){
			arr2[x]=arr[n2];
			//System.out.println(arr2[x]);
			n2++;
		}
		int i=0,j=0,k=start;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				arr[k]=arr1[i];
				i++;
			}
			else{
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length){
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length){
			arr[k]=arr2[j];
			j++;
			k++;
		}
	}
	void mergeSort(int arr[],int start,int end){
		if(start<end){
			int mid=start+((end-start)/2);
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			sort(arr,start,mid,end);
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
		new MergeSort().mergeSort(arr,0,arr.length-1);
		System.out.println("Sorted by merge sort: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
