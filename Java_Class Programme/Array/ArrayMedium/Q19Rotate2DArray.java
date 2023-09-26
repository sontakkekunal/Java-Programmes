/*
 19] Rotate a 2D array without using extra space

Given a N x N 2D matrix Arr representing an image. Rotate the image by 90
degrees (anti-clockwise). You need to do this in place. Note that if you end up
using an additional array, you will only receive a partial score.
Example 1:
Input:
N = 3
Arr[][] = {{1, 2, 3}
{4, 5, 6}
{7, 8, 9}}
Output:
3 6 9
2 5 8
1 4 7
Explanation: The given matrix is rotated
by 90 degrees in an anti-clockwise direction.
Example 2:
Input:
N = 4
Arr[][] = {{1, 2, 3, 4}
{5, 6, 7, 8}
{9, 10, 11, 12}
{13, 14, 15, 16}}
Output:
4 8 12 16
3 7 11 15
2 6 10 14
1 5 9 13
Explanation: The given matrix is rotated
by 90 degrees in an anti-clockwise direction.
*/
import java.util.*;
class Q19Rotaion2DArray{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array rows: ");
		int row=sc.nextInt();
		System.out.println("Enter Array coloums: ");
		int coloumns=sc.nextInt();
		int arr[][]=new int[row][coloumns];
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+(i+1)+" arry: ");
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Output: ");
		int m=0;
		for(int j=arr[m].length-1;j>=0;j--){
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i][j]+" ");
			}
			m++;
			System.out.println();
		}
	}
}

