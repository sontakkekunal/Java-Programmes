
import java.util.*;
class LongestSubArrMinMax{
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
		boolean flag1=true;
		boolean flag2=true;
		int diff=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
			int val=0;
			if(flag1 && max==arr[i]){
				maxD=i;
				flag1=false;
			}
			else if(maxD!=-1 && min==arr[i]){
				val=i-maxD+1;
				if(val>diff)
					diff=val;
			}

			if(flag2 && min==arr[i]){
				minD=i;
				flag2=false;
			}
			else if(minD!=-1 && max==arr[i]){
				val=i-minD+1;
				if(val>diff)
                                        diff=val;
			}
			if(min==max){
				diff=N;
				break;
			}
		}
		System.out.println("output: "+diff);
	}
}
