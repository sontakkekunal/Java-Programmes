/*
 Give a N*N Matrix print the boundary in clockwise fansion
 */
import java.util.Scanner;
class BoundaryMatricxPrint{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter no. of rows in the array: ");
                int row=sc.nextInt();
                System.out.println("Enter no. of coloumns in the array: ");
                int coloumns=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[][]= new int[row][coloumns];
                for(int i=0;i<arr.length;i++){
                        System.out.println("Enter "+(1+i)+" rows elements: ");
                        for(int j=0;j<arr[i].length;j++){
                                arr[i][j]=sc.nextInt();
                        }
                }
		int i=0;
		int j=0;
		int N=arr.length-1;
		System.out.println("Output: ");
		for(;j<N;j++){
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
		for(;i<N;i++){
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
		for(;j>0;j--){
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
		for(;i>0;i--){
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
	}
}
