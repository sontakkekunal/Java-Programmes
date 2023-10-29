/*
 Given an array A and element B.
 Find the minimum no of swaps required to bring all the elements <=B togetther.
Input:
        Arr:{1,12,10,14,3,10,5}
        B=8;
Ouput: 
*/
import java.util.*;
class MinNoOfSwapBETogth{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter B: ");
                int b=sc.nextInt();
		int n=0;
                for(int i=0;i<N;i++){
			if(arr[i]<=b)
				n++;
		}
		int start=0;
		int end=n-1;
		int maxCount=Integer.MIN_VALUE;
		while(end<N){
			int count=0;
			for(int i=start;i<=end;i++){
				if(arr[i]<=b)
					count++;
			}
			if(count>maxCount)
				maxCount=count;
			start++;
			end++;
		}
		maxCount=n-maxCount;
		System.out.println("Output: "+maxCount);
	}
}

