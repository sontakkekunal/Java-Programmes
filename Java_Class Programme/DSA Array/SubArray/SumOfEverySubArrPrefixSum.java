/*
 Give an array of size N, int arr[]= new int[]{2,4,1,3}
 B.print the sum of every single subarray using prefix sum
 */
import java.util.*;
class SumOfEverySubArrPrefixSum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number of array: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int prefixSum[]= new int[N];
		prefixSum[0]=arr[0];
		for(int i=1;i<N;i++){
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
		System.out.println("Output: ");
		int sum=0;
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				if(i==0)
					sum=prefixSum[j];
				else
					sum=prefixSum[j]-prefixSum[i-1];
				System.out.println(sum);
			}
		}
	}
}


