/*
 42] Count the number of elements between two given elements
in an array. Given an unsorted array and two elements num1
and num2.

The task is to count the number of elements occurring between the given elements
(excluding num1 and num2). If there are multiple occurrences of num1 and num2,
we need to consider the leftmost occurrence of num1 and rightmost occurrence of
num2.
Example 1:
Input : Arr[] = {4, 2, 1, 10, 6}
num1 = 4 and num2 = 6
Output : 3
Explanation:
We have an array [4, 2, 1, 10, 6] and num1 = 4 and num2 = 6. So, the
leftmost index of num1 is 0 and the rightmost index of num2 is 4. So, the
total number of elements between them is [2, 1, 10] So, the function will
return 3 as an answer.

Example 2:
Input : Arr[] = {3, 2, 1, 4}
num1 = 2 and num2 = 4
Output : 1
*/
import java.util.Scanner;
class Q42CountEleBetN1N2{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		boolean flag=false;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num2)
				flag=false;

			if(flag)
				count++;

			if(arr[i]==num1)
				flag=true;
		}
		System.out.println("Output: "+count);
	}
}




