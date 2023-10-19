import java.util.*;
class PrintSubArrSToE{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number of array: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
              	System.out.println("Enter start: ");
		int start=sc.nextInt();
		System.out.println("Enter end: ");
		int end=sc.nextInt();
		System.out.println("Output: ");
		for(int i=start;i<=end;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
        }
}

