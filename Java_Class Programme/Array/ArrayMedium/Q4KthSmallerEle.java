/*
 4] Kth smallest element

Given an array arr[] and an integer K where K is smaller than the size of the array,
the task is to find the Kth smallest element in the given array. It is given that all
array elements are distinct.
Note :- l and r denotes the starting and ending index of the array.
Example 1:
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation : 3rd smallest element in the given array is 7.
Example 2:
Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation : 4th smallest element in the given array is 15.
*/
import java.util.*;
class Q4KthSmallerEle{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
		System.out.println("Enter kth smallest element to searcj: ");
		int k=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                int count=0;
		int N=1;
		int n=1;
		int i=0;
		int j=0;
                for(int m=1;m<=N;m++){
			if(m==N-n+1)
                        	arr[i]=sc.nextInt();
			if(arr[i]<arr[j] && i>j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
			if(N==m){
				if(n==size)
                                	break;
				i++;
				j=0;
				n++;
				N=n+N;
			}
		}
		System.out.println("Element is: "+arr[k-1]);

	}
}
