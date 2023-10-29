import java.util.Scanner;
class SlidingWindow{
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
		int sum=0;
		for(int i=start;i<=end;i++){
			sum=sum+arr[i];
		}
		if(sum>maxSum)
			maxSum=sum;
		start++;
		end++;
		while(end<N){
			sum=sum-arr[start-1]+arr[end];
			if(sum>maxSum)
				maxSum=sum;
			start++;
			end++;
		}
                System.out.println("Output: "+maxSum);
        }
}

