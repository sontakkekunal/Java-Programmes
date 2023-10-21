/*
 Give a square matrix of size N*N.Convert the matrics to its Transpose matrix
 */
import java.util.Scanner;
class TransposeMatricx{
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
                System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr[i].length;j++){// if we instinalize j=i, it will swap diogonal itself. so it take extra 
							   // iteration
				arr[i][j]=arr[i][j]+arr[j][i];
				arr[j][i]=arr[i][j]-arr[j][i];
				arr[i][j]=arr[i][j]-arr[j][i];
			}
		}
		for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}

