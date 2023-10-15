/*
 Subarray
 Given an intger array of size N
 Return the length of the smallest subarray which contain both the maximum of the array and the minimum of the array
Arr={1,2,3,1,3,4,6,4,6,3}

 */
import java.util.*;
class SubArrayMinMax{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size:  ");
		int N=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]= new int[N];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		int minD=-1;
		int maxD=-1;
		int diff=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			int val=0;
			if(min==arr[i]){
				minD=i;
			}
			else if(minD!=-1 && max==arr[i]){
				val=i-minD+1;
				if(val<diff)
					diff=val;
			}

			if(max==arr[i]){
				maxD=i;
			}
			else if(maxD!=-1 && min==arr[i]){
				val=i-maxD+1;
				if(val<diff)
                                	diff=val;
			}

			if(min==max){
				diff=1;
				break;
			}
		}
		System.out.println("Output: "+diff);
	}
}


