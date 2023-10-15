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
		int diff=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			int val=0;
			if(max==arr[i]){
				for(int j=i+1;j<N;j++){
					if(arr[j]==min){
						val=j-i+1;
					
						if(val<diff)
							diff=val;
					}
				}
			}
			if(min==arr[i]){
				for(int j=i+1;j<N;j++){
                                        if(arr[j]==max){
                                                val=j-i+1; 
                                        	if(val<diff)
                                                	diff=val;
					}
                                }
			}
		}
		System.out.println("Output: "+diff);
	}
}

