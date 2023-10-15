/*
Given an integer array of size  N.Build an array rightmax of size N. rightmax of i contains the maximum for index i to the index N-1
Arr:{-3,6,2,4,5,2,8,-9,3,1}
N:10
leftMaxArr:{ 8,8,8,8,8,8,8,3,3,1}
*/
import java.util.*;
class RightCarryMax{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int rightMaxArr[]= new int[N];
		rightMaxArr[N-1]=arr[N-1];
		for(int i=N-2;i>=0;i--){
			if(arr[i]>rightMaxArr[i+1])
				rightMaxArr[i]=arr[i];
			else
				rightMaxArr[i]=rightMaxArr[i+1];
		}
		System.out.println("Output: ");
		for(int i=0;i<N;i++){
                        System.out.println(rightMaxArr[i]);
                }
	}
}

