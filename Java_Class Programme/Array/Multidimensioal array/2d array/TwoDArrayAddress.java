import java.util.*;
class TwoDArrayAddress{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row=sc.nextInt();
		System.out.println("Enter number of coloums : ");
		int coloumns=sc.nextInt();
		int arr[][]=new int[row][coloumns];
		for(int i=0;i<row;i++){
			for(int j=0;j<coloumns;j++){
				System.out.println("Enter elements for rows "+i+" and coloumn "+j+" : ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elemnt at row 1 and coloumn 1 is "+arr[1][1]);
		System.out.println("Address of first row(first Sub array of 2d array) is "+arr[0]);
		System.out.println("Address of second row(second Sub array of 2d array) is "+arr[1]);
		System.out.println("Address of 2d array is "+arr);
		System.out.println("hash code of row 0 and 1 coloums is "+System.identityHashCode(arr[0][1]));
		System.out.println("hash code of row 1 and 0 coloums is "+System.identityHashCode(arr[1][0]));
	}
}


