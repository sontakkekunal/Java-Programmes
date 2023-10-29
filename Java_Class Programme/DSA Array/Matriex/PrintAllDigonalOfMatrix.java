/*
 Print all diogonals of a sqare matrix 
 (left to right) or (right to left)
 A.Staring from 0th row
 B. all diogonals
 */
import java.util.Scanner;
class PrintAllDigonalOfMatrix{
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
		System.out.println("Output(top right to bottom left): ");
		for(int x=coloumns-1;x>=0;x--){
			int j=x;
			int i=0;
			while(j>=0 && i<rows){
				System.out.print(arr[i][j]+"  ");
				i++;
				j--;
			}
			System.out.println();
		}
		System.out.println("Output(top left to bottom right): ");
		for(int x=0;x<coloumns;x++){
			int j=x;
			int i=0;
			while(j<coloumns && i<rows){
				System.out.print(arr[i][j]+"  ");
                                i++;
                                j++;
                        }
                        System.out.println();
                }
		System.out.println("Output(bottom right to top left): ");
		for(int x=coloumns-1;x>=0;x--){
			int j=x;
			int i=rows-1;
			while(j>=0 && i>=0){
				System.out.print(arr[i][j]+"  ");
                                i--;
                                j--;
                        }
                        System.out.println();
                }
		System.out.println("Output(bottom left to top right): ");
		for(int x=0;x<coloumns;x++){
			int j=x;
			int i=rows-1;
			while(j<coloumns && i>=0){
				System.out.print(arr[i][j]+"  ");
                                i--;
                                j++;
                        }
                        System.out.println();
                }
	}
}



