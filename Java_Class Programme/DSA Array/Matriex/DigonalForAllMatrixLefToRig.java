//Given a matrix of size N*M
//print all diognals(R->L)
import java.util.Scanner;
class DigonalForAllMatrix{
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
		for(int i=coloumns-1;i>=0;i--){
			int m=i;
			int n=0;
			if(m-row+1>=0)
				n=row;
			else
				n=m+1;
			for(int j=0;j<n;j++){
				System.out.print(arr[j][m]+"  ");
				m--;
			}
			System.out.println();
		}
	}
}


