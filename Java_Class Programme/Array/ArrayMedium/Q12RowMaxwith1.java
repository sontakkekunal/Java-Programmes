/*
 12] Row with max 1s

Given a boolean 2D array of n x m dimensions where each row is sorted. Find the
0-based index of the first row that has the maximum number of 1's.
Example 1:
Input:
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
{0, 0, 1, 1},
{1, 1, 1, 1},
{0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based indexing).
Example 2:
Input:
N = 2, M = 2
Arr[][] = {{0, 0}, {1, 1}}
Output: 1
Explanation: Row 1 contains 2 1's (0-based indexing).
*/
import java.util.*;
class Q12RowMaxWith1{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
		System.out.println("Enter array colums: ");
		int col=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[][] = new int[size][col];
		int max=0;
		int value=0;
                for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+(i+1)+" rows elements ");
			int count=0;
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==1)
					count++;
			}
			if(i==0)
				max=count;
			if(count>max){
				max=count;
				value=i;
			}
		}
		System.out.println("Row with hax 1 are : "+value);
	}
}



