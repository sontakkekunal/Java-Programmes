import java.util.*;
class MaxArrayBetRange{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array size: ");
		int N=sc.nextInt();
		int arr[]= new int[N];
		System.out.println("Enter array: ");
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a last range: ");
		int x=sc.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<x;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Max in range last "+x+" is "+max);
	}
}

