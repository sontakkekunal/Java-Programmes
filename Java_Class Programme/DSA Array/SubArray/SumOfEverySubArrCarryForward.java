/*
 Give an array of size N, int arr[]= new int[]{2,4,1,3}
 C.print the sum of every single subarray using Carry forward sum
 */
import java.util.*;
class SumOfEverySubArrCarryForward{
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
			int sum=0;
			for(int j=i;j<N;j++){
				sum=sum+arr[j];
				System.out.println(sum);
			}
		}
	}
}

