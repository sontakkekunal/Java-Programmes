
import java.util.*;
class SumOfEverySubArrPrefixSumStoreInArr{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number of array: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int subArrSum[]= new int[(N*(N+1))/2];
		int a=0;
		for(int i=0;i<N;i++){
			int sum=0;
			for(int j=i;j<N;j++){
				sum=sum+arr[j];
				subArrSum[a]=sum;
				a++;
			}
		}
		System.out.println("Output: ");
		for(int i=0;i<subArrSum.length;i++){
			System.out.println(subArrSum[i]);
		}
	}
}

