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
		int count=0;
		for(int i=0;i<N-1;i++){
			if(arr[i]<=b){
				if(!(arr[i+1]<=b))
					count++;
			}
		}
		if(!(arr[N-1]<=b))
			count--;
		System.out.println("Ouput: "+count);
	}
}

	
