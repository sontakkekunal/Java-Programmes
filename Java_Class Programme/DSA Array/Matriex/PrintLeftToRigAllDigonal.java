//Given a matrix of size N*M
//print all diognals(R->L)
import java.util.Scanner;
class PrintLeftToRightAllDigonal{
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
		for(int y=coloumns-1;y>=0;y--){
			int j=y;
			int i=0;
			while(i<row && j>=0){
				System.out.print(arr[i][j]+"  ");
				i++;
				j--;
			}
			System.out.println();
		}
	}
}
