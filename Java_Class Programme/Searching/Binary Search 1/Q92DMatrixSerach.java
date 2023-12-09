/*
 Q 9.
You are given a 2D matrix where each row and each column is sorted in ascending
order. Write a program to search in a matrix to determine if a target element is
present in the matrix.
[
[1, 4, 7, 11],
[2, 5, 8, 12],
[3, 6, 9, 16],
[10, 13, 14, 17]
]

target element 5, the function should return true, as 5 is present in the matrix.
*/
import java.util.Scanner;
class Q92DMatrixSerach{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array row: ");
                int size=new Integer(sc.nextInt());
		System.out.println("Enter array columns: ");
		int columns=sc.nextInt();
                int arr[][]= new int[size][columns];
                System.out.println("Enter array: ");
                for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+(i+1)+" row: ");
                        for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
                }
                System.out.println("Enter target element: ");
                int k=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			int start=0;
			int end=arr[i].length-1;
			while(start<=end){
				int mid=(start+end)/2;
				if(arr[i][mid]==k){
					flag=true;
					break;
				}
				if(arr[i][mid]<k)
					start=mid+1;
				if(arr[i][mid]>k)
					end=mid-1;
			}
		}
		System.out.println("Output: "+flag);

	}
}
