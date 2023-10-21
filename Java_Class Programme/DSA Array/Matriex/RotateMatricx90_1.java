/*
 Given a matrix of N*N .Rotate the matricx 90 degree clockwise from the top-right corner
Note: (No-new matricx)
*/
import java.util.Scanner;
class RotateMatricx90degree{
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
		//transpose
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr[i].length;j++){
				arr[i][j]=arr[i][j]^arr[j][i];
				arr[j][i]=arr[i][j]^arr[j][i];
				arr[i][j]=arr[i][j]^arr[j][i];
			}
		}

		//Inverse
		for(int i=0;i<arr.length;i++){
			int start=0;
			int end=arr[i].length-1;
			int arr1[]=arr[i];
			while(start<end){
				int temp=arr1[start];
				arr1[start]=arr1[end];
				arr1[end]=temp;
				start++;
				end--;
			}

		}
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
