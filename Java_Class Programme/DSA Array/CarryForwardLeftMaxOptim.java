/*
 Given an integer array of size  N.Build an array leftmax of size N. Leftmax of i contains the maximum for index 0 to the index i
Arr:{-3,6,2,4,5,2,8,-9,3,1}
N:10
leftMaxArr:{-3,6,6,6,6,6,8,8,8,8}
*/
import java.util.*;
class LeftMaxArrOptim{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
                int leftMaxArr[] = new int[N];
		leftMaxArr[0]=arr[0];
		for(int i=1;i<N;i++){
			if(arr[i]>leftMaxArr[i-1])
				leftMaxArr[i]=arr[i];
			else
				leftMaxArr[i]=leftMaxArr[i-1];
		}
		System.out.println("Output: ");
		for(int i=0;i<N;i++){
                        System.out.println(leftMaxArr[i]);
                }
	}
}


