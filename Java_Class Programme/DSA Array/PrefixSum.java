//PrefixSum array is in ascending order. PrefixSum is the sum of array uptill its ranges.
//e.g.--> arr=[-3,6,2,4,5,2,8,-9,3,1]
//		prefixSumArray=[-3,3,5,9,14,16,24,15,18,19]
//When there range of queries  and mutiple queries then we use prefixSum


//Q
//Give an array of size N and Q number of queries .Query contains two paramters (s,e),s=> start index and e=>end index .For all
//queries, print the sum of all element from index s to index e.
//arr: [-3,6,2,4,5,2,8,-9,3,1]
//N=10
//Q=3
//Queries       s        e     sum
//Queries1      1        3      12
//Queries2      2        7      12
//Queries3      1        1      6
import java.util.Scanner;
class PrefixSumArray{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of queries: ");
                int Q=sc.nextInt();
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		int prefixSArr[]= new int[N];
		prefixSArr[0]=arr[0];
		for(int i=1;i<N;i++){
			prefixSArr[i]=prefixSArr[i-1]+arr[i];
		}
		for(int x=0;x<Q;x++){
			System.out.println("Enter start index: ");
			int start=sc.nextInt();
			System.out.println("Enter end index: ");
			int end=sc.nextInt();
			int sum=0;
			if(start==0)
				sum=prefixSArr[end];
			else
				sum=prefixSArr[end]- prefixSArr[start-1];
			System.out.println("Sum in range "+start+" and "+end+" is: "+sum);
		}
	}
}
