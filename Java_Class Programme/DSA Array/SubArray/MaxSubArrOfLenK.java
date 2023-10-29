//Find the maximum subarray sum of length K
//Input: {-3,4,-2,5,3,-2,8,2,1,4}
//K:4
//Ouput:18
import java.util.Scanner;
class MaxSubArrOfLenK{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter K : ");
                int k=sc.nextInt();
                int maxSum=Integer.MIN_VALUE;
		int start=0;
		int end=k-1;
		while(end<N){
			int sum=0;
			for(int i=start;i<=end;i++){
				sum=sum+arr[i];
			}
			if(sum>maxSum)
				maxSum=sum;
			start++;
			end++;
		}
                System.out.println("Output: "+maxSum);
        }
}

