/*
 given a rectangular matrrix N*M 
 Covert the matrix to its transpose
 */
import java.util.Scanner;
class RectangularMatrixTranspose{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array rows: ");
                int rows=sc.nextInt();
                System.out.println("Enter number of coloumns : ");
                int coloumns=sc.nextInt();
                int arr[][]= new int[rows][coloumns];
                System.out.println("Enter array: ");
                for(int i=0;i<arr.length;i++){
                        System.out.println("Enter "+(i+1)+" rows elements: ");
                        for(int j=0;j<arr[i].length;j++){
                                arr[i][j]=sc.nextInt();
                        }
                }
		int rows1=coloumns;
		int coloumns1=rows;
		int arrTranspose[][]= new int[rows1][coloumns1];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arrTranspose[j][i]=arr[i][j];
			}
		}
		System.out.println("Output: ");
		for(int i=0;i<arrTranspose.length;i++){
			for(int j=0;j<arrTranspose[i].length;j++){
				System.out.print(arrTranspose[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
