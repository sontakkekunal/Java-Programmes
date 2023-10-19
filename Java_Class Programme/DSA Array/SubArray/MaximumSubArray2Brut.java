/*
 Maximum Subarray
 Given an integer array of size N
 Find the contiguous subarray( containg atleast one number) which has the largest sum and return its sum
Input:{-2,1,-3,4,-1,2,1,-5,4}
Output: 6
Explanation:{4,-1,2,1} has the largest sum=6
*/
import java.util.Scanner;
class MaximumSubArr{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number of array: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
                int maxSum=Integer.MIN_VALUE;
                for(int i=0;i<N;i++){
                        for(int j=i;j<N;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum=sum+arr[k];
				}
                                if(sum>maxSum)
                                        maxSum=sum;
                        }
                }
                System.out.println("Output: "+maxSum);
        }

}

