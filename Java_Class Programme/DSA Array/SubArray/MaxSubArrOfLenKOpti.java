import java.util.Scanner;
class MaxSubArrOfLenKOpti{
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
		int prefixSum[]=new int[N];
		prefixSum[0]=arr[0];
		for(int i=1;i<N;i++){
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
                while(end<N){
			int sum=0;
			if(start==0)
				sum=prefixSum[end];
			else
				sum=prefixSum[end]-prefixSum[start-1];
			if(sum>maxSum)
				maxSum=sum;
                        start++;
                        end++;
                }
                System.out.println("Output: "+maxSum);
        }
}

