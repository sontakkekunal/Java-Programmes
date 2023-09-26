/*
 26] Spirally traversing a matrix
Given a matrix of size r*c. Traverse the matrix in spiral form.
Example 1:
Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
		{5, 6, 7, 8},
        	{9, 10, 11, 12},
		{13, 14, 15,16}}
Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:
Example 2:
Input:
r = 3, c = 4
matrix[][] = {{1, 2, 3, 4},
{5, 6, 7, 8},
{9, 10, 11, 12}}
Output:
1 2 3 4 8 12 11 10 9 5 6 7
Explanation:
Applying the same technique as shown above, output for the 2nd test case
will be 1 2 3 4 8 12 11 10 9 5 6 7.
*/
import java.util.*;
class Q26SpirallyTranserveMatix{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array rows ");
                int size=sc.nextInt();
		System.out.println("Enter array coloumns: ");
		int column=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[][]=new int[size][column];;;
                for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
                       		 arr[i][j]=sc.nextInt();
			}
                }
		for(int m=0;m<size1;m++){
			for(int n=0;n<size2;n++){
				System.out.print(arr[i][j]+" ");
				if(
				
			}
		}

	}
}

