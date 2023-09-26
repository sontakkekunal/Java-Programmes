/*
5] k largest elements
Given an array Arr of N positive integers and an integer K, find K largest elements
from the array. The output elements should be printed in decreasing order.
Example 1:
Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the array is 787 and second largest is 23.
Example 2:
Input:
N = 7, K = 3
Arr[] = {1, 23, 12, 9, 30, 2, 50}
Output: 50 30 23
Explanation: 3 Largest element in the array are 50, 30 and 23. 
 */

import java.util.*;
class Q4KthSmallerEle{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter kth Largest element to search: ");
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
                        if(arr[i]>arr[j] && i>j){
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
		System.out.println("largest up to "+k+" Element are : ");
		for(int v=0;v<k;v++){
			System.out.println(" "+arr[v]);
		}
	}
}
