/*
 Give an array of size N, int arr[]= new int[]{2,4,1,3}
 A.print the sum of every single subarray
 */
import java.util.*;
class SumOfEverySubArrBruteForce{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number of array: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Output: ");
                for(int i=0;i<N;i++){
                        for(int j=i;j<N;j++){
				int sum=0;
                                for(int k=i;k<=j;k++){
                                        sum=sum+arr[k];
                                }
                                System.out.println(sum);
                        }
                }
		//T.c.--->O(N^3)
		//S.c.--->O(1)
        }
}

