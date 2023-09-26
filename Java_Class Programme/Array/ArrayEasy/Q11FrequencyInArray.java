/*
 Que 11 : Frequencies of limited Range Array Elements
Given an array A[] of N positive integers which can contain integers from 1 to P where
elements can be repeated or can be absent from the array. Your task is to count the
frequency of all elements from 1 to N.
Note: The elements greater than N in the array can be ignored for counting and do modify
the array in-place.
Example 1:
Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
Example 2:
Input:
N = 4
arr[] = {3,3,3,3}
P = 3
Output:
0 0 4 0
Explanation: Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 0 times.
3 occurring 4 times.

4 occurring 0 times.
*/
import java.util.Scanner;
class Q11Frequency{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter integr: ");
		int p=sc.nextInt();
		for(int i=1;i<=size;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]>p)
					continue;
				if(i==arr[j])
					count++;
			}
			System.out.print(count+ " ");

		}
	}
}


