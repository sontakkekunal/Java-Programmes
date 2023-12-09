import java.util.Scanner;
class BubbleSortRecusrionOpti3{
	boolean bubbleSortSwap(boolean flag,int j,int n,int arr[]){
		if(j>=n-1)
			return flag;
		if(arr[j]>arr[j+1]){
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			flag=true;
		}
		j++;
		return bubbleSortSwap(flag,j,n,arr);
	}
	void bubbleSort(int arr[] ,int n){
		if(n==1)
			return ;
		if(bubbleSortSwap(false,0,n,arr)==false)
			return;
			
		bubbleSort(arr,n-1);
	}
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter arrray size: ");
                int size=sc.nextInt();
                System.out.println("Enter array: ");
                int []arr= new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		new BubbleSortRecusrionOpti3().bubbleSort(arr,arr.length);
		System.out.println("O/P:-->  ");
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"  ");
                }
	}
}
