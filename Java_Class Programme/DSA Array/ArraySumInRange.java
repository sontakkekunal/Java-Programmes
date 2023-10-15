import java.util.*;
class ArraySumRange{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start index: ");
		int start=sc.nextInt();
		System.out.println("Enter end index: ");
		int end =sc.nextInt();
		int arr[]={2,5,3,11,7,9,4,3};
		int sum=0;
		for(int i=start;i<=end;i++){
			sum=sum+arr[i];
		}
		System.out.println("sum in range "+start+" and "+end+" is: "+sum);
	}
}
//TC:--> O(N) .....worst condition start can be 0 and end can be N-1
