import java.util.Scanner;
class BubbleSortRecusrionOpti1{
	void bubbleSort(int arr[] ,int n){
		if(n>=arr.length)
			return ;
		boolean flag=false;
		for(int j=0;j<arr.length-1-n;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
			}
		}
		if(flag==false)
			return;
		bubbleSort(arr,n+1);
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
		new BubbleSortRecusrionOpti1().bubbleSort(arr,0);
		System.out.println("O/P:-->  ");
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"  ");
                }
	}
}
