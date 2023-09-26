/*
 Que 15 : Union of two sorted Array
Union of two arrays can be defined as the common and distinct elements in the two
arrays.
Given two sorted arrays of size n and m respectively, find their union.

Example 1:
Input:
n = 5, arr1[] = {1, 2, 3, 4, 5}
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
Example 2:
Input:
n = 5, arr1[] = {2, 2, 3, 4, 5}
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 1 2 3 4 5
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
Example 3:
Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 1 2
Explanation: Distinct elements including both the arrays are: 1 2.
*/
import java.util.Scanner;
class Q15UnionArray{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter Second Array size: ");
                int size1=sc.nextInt();
                System.out.println("Enter second Array: ");
                int arr1[] = new int[size1];
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
                }
		int max=0;
		if(size1>size)
			max=size1;
		else
			max=size;
		int arr2[]=  new int[max+1];
		int  m=0;
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=0;j<arr2.length;j++){
		//		System.out.println(arr[i]+" l "+arr2[j]);
				if(arr[i]==arr2[j]){
					flag=false;
					break;
				}
			}
			if(flag){
				arr2[m]=arr[i];
				m++;
			}
		}
		for(int i=0;i<arr1.length;i++){
			boolean flag=true;
                        for(int j=0;j<arr2.length;j++){
                                if(arr1[i]==arr2[j]){

                                        flag=false;
                                        break;
                                }
                        }
                        if(flag){
                                arr2[m]=arr1[i];
                                m++;
                        }
		}
		System.out.println("Output: ");
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]!=0)
				System.out.print(arr2[i]+" ");
		}
	}
}

			


