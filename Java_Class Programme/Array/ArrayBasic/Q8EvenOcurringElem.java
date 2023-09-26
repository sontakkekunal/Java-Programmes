/*
 Even occurring elements
Given an array Arr of N integers that contains an odd number of occurrences for all
numbers except for a few elements which are present even number of times. Find
the elements which have even occurrences in the array.
Example 1:
Input:
N = 11
Arr[] = {9, 12, 23, 10, 12, 12,
15, 23, 14, 12, 15}
Output: 12 15 23
Example 2:
Input:
N = 5
Arr[] = {23, 12, 56, 34, 32}
Output: -1
Explanation:
Every integer is present odd number of times.
*/
import java.util.*;
class Q8EvenOccursEle{
	int[] removeDublicate(int[] arr){
		int arr1[]= new int[arr.length];
		for(int i=0;i<arr1.length;i++){
			boolean bool =true;
			for(int j=0;j<arr1.length;j++){
				if(arr[i]!=arr1[j])
					continue;
				else{
					bool=false;
					break;
				}
			}
			if(bool==true)
				arr1[i]=arr[i];
		}
		int count1=-1;
		for(int i=0;i<arr1.length;i++){
                        if(arr1[i]!=0){
                                count1++;
                        }
                }
		int arr2[]= new int[count1+1];
		int m=0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=0){
				arr2[m]=arr1[i];
				//System.out.println(arr2[m]);
				m++;
			}
		}
		return arr2;
	}
		
	
        public static void main(String [] args){
		boolean flag=false;
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size =sc.nextInt();
                int A[] = new int[size];
                System.out.println("Enter array: ");
                for(int i=0;i<A.length;i++){
                        A[i]=sc.nextInt();
                }
		Q8EvenOccursEle obj = new Q8EvenOccursEle();
                int arr[]=obj.removeDublicate(A);

		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<A.length;j++){
				if(arr[i]==A[j])
					count++;
			}
			if(count%2==0){
				System.out.println("Even occurance number is : "+arr[i]);
				flag=false;
			}
		}
		if(flag==true)
			System.out.println(-1);


	}
}
