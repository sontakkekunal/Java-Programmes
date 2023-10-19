import java.util.*;
class AllSubArrPrint{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number of array: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Output: ");
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]+"  ");
				}
				System.out.println();
			}
		}
        }
}

