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
		int j=0;
		int temp=Integer.MIN_VALUE;
		int a=0;
		boolean flag=true;
                for(int i=0;i<arr.length;i++){
			if(arr[j]==Integer.MIN_VALUE){
				int temp2=arr[j];
                        	arr[j]=temp;
                        	temp=temp2;
				j++;
			}
			int temp1=arr[j];
                        arr[j]=temp;
                        temp=temp1;
			j=j+B;
			if(j>=N){
				j=j-N;
			}
			/*
			if(j>=N){
				j=j-N;
				if(B%2==1){
					int temp2=arr[j];
                        		arr[j]=temp;
                        		temp=temp2;
					j++;
				}
			}*/
                }
                System.out.println("Output: ");
                for(int i=0;i<N;i++){
			if(arr[i]==Integer.MIN_VALUE)
				arr[i]=temp;
                        System.out.print(arr[i]+"  ");
                }
        }
}
