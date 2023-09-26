/*
 14] Sum of two elements with sum nearest to zero

Given an integer array of N elements. You need to find the maximum sum of two
elements such that the sum is closest to zero.
Example 1:
Input:
N = 3
arr[] = {-8 -66 -60}
Output: -68
Explanation: Sum of two elements closest to zero is -68 using numbers -60
and -8.
Example 2:
Input:
N = 6
arr[] = {-21 -67 -37 -18 4 -65}
Output: -14
Explanation: Sum of two elements closest to zero is -14 using numbers -18
and 4.
*/
import java.util.*;
class Q14SumNearToZero{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter array: ");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		boolean flag=true;
		int m=0;
		int n=0;
		int sum1=0;
		int sum=0;
		for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr.length;j++){
				if(i!=j){
					sum=arr[i]+arr[j];
					if(flag){
						sum1=sum;
						if(sum1<0)
							sum1=-sum1;
						flag=false;
					}
				}
				else
					continue;
				if(sum<0)
					sum=-sum;
				if(sum<sum1){
					sum1=sum;
					m=i;
					n=j;
				}
			}
                }
		System.out.println("Sum close to zero is: "+(arr[m]+arr[n]));
	}
}


