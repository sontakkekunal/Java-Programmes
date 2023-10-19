/*
 Maximum Subarray
 Given an integer array of size N
 Find the contiguous subarray( containg atleast one number) which has the largest sum and return its sum
Input:{-2,1,-3,4,-1,2,1,-5,4}
Output: 6
Explanation:{4,-1,2,1} has the largest sum=6
*/
import java.util.Scanner;
class MaximumSubArr1{
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
                int maxSum=Integer.MIN_VALUE;
                for(int i=0;i<N;i++){
                        int sum=0;
                        for(int j=i;j<N;j++){
                                if(i==0)
					sum=prefixSum[j];
				else
					sum=prefixSum[j]-prefixSum[i-1];
                                if(sum>maxSum)
                                        maxSum=sum;
                        }
                }
                System.out.println("Output: "+maxSum);
        }
}

