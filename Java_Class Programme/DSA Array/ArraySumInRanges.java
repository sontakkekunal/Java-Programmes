//Give an array of size N and Q number of queries .Query contains two paramters (s,e),s=> start index and e=>end index .For all
//queries, print the sum of all element from index s to index e.
//arr: [-3,6,2,4,5,2,8,-9,3,1]
//N=10
//Q=3
//Queries       s        e     sum
//Queries1	1   	 3	12
//Queries2	2   	 7 	12
//Queries3	1      	 1 	6
import java.util.*;
class ArrayInRanges{
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
		for(int i=0;i<Q;i++){
			System.out.println("Enter start index: ");
			int start=sc.nextInt();
			System.out.println("Enter end index: ");
			int end=sc.nextInt();
			int sum=0;
			for(int j=start;j<=end;j++){
				sum=sum+arr[j];
			}
			System.out.println("Sum in range "+start+" and "+end+" is: "+sum);
		}
	}
}
//TC-->O(Q*N).... worst condition

