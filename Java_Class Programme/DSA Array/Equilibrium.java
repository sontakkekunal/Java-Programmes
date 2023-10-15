/*
 Equilbrium index of an array
 you are given an array A of integer of size N
 Your task is to find the equriblium index of the given array
 The equriblium index of an array is an index such that the sum of element at lower index is equal to the sum of element at higher inedex
 If there are no elements that are at lower index

 Problem constaints:
 1<=N<=105
 -105<=A[i}<=105
 Example Input:
Input1: A={-7,1,5,2,-4,3,0}
Output1: 3

Input2: {1,2,3}
output2: -1
*/
import java.util.*;
class Equiblrium{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int N=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]= new int[N];
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		boolean flag=true;
		for(int i=0;i<N;i++){
			int left=0;
			int right=0;
			for(int j=0;j<i;j++){
				left=left+arr[j];
			}
			for(int k=i+1;k<N;k++){
				right=right+arr[k];
			}
			if(left==right){
				System.out.println("Equiblrium at: "+i);
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Equiblrium not found "+(-1));
	}
}
