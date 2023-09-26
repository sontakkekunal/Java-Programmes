/*
 Que 17 : Find all Pairs with given Sum
Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to
find all pairs from both arrays whose sum is equal to X.
Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1)
and (u2,v2), if u1 < u2 then
(u1,v1) should be printed first else second.
Example 1:
Input:
A[] = {1, 2, 4, 5, 7}
B[] = {5, 6, 3, 4, 8}
X = 9
Output:
1 8
4 5
5 4
Explanation: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.
Example 2:
Input:
A[] = {-1, -2, 4, -6, 5, 7}
B[] = {6, 3, 4, 0}
X = 8
Output:
4 4
5 3
*/
import java.util.Scanner;
class Q16SumPair{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
		System.out.println("Enter sum to find in pair: ");
		int sumf=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter second array size: ");
		int size1=sc.nextInt();
		System.out.println("Enter second arry");
		int arr1[]=new int[size1];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Output: ");
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr1.length;j++){
				if((arr[i]+arr1[j])==sumf){
					System.out.println(arr[i]+" "+arr1[j]);
				}
                        }
                }
	}
}

