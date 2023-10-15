/*
 Given an intger array A of size N and an intger B,you have to retain the same array after rotating it B times towards the right
 problem constrints:
 1<=N<=10^5
 1<=A[i]<=10^9
 1<=B<10^9
 */

import java.util.*;
class ArrayRotation{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
		}
                System.out.println("Enter rotation: ");
                int B=sc.nextInt();
		boolean flag=true;
		int j=B;
		int swap=arr[0];
                for(int i=0;i<arr.length;i++){
			int temp=arr[j];
			arr[j]=swap;
			swap=temp;
			j=j+B;
			if(j>=arr.length)
				j=j-N;
                }
                System.out.println("Output: ");
                for(int i=0;i<N;i++){
                        System.out.print(arr[i]+"  ");
                }
        }
}
