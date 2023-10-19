/*
 Given array of size N
 Find the total sum of all subarray sum
 int arr[]= new int[]{1,2,3};
Output: 20
*/
import java.util.*;
class TotalSumOfSubArrCarryForward{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number of array: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int total=0;
		for(int i=0;i<N;i++){
			int sum=0;
			for(int j=i;j<N;j++){
				sum=sum+arr[j];
				total=total+sum;
			}
		}
		System.out.println("Output: "+total);
	}
}
