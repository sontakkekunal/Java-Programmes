/*
 Given array of size N
 Find the total sum of all subarray sum
 int arr[]= new int[]{1,2,3};
Output: 20
*/
import java.util.*;
class TotalSumOfSubArrPrefixSum{
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
                int sum=0;
		int total=0;
                for(int i=0;i<N;i++){
                        for(int j=i;j<N;j++){
                                if(i==0)
                                        sum=prefixSum[j];
                                else
                                        sum=prefixSum[j]-prefixSum[i-1];
                                total=total+sum;
                        }
                }
		System.out.println("Output: "+total);
        }
}

