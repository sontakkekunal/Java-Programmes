/*
 40] Fibonacci in the array

Given an array arr of size N, the task is to count the number of elements of the
array which are Fibonacci numbers
Example 1:
Input: N = 9, arr[] = {4, 2, 8, 5, 20, 1,
40, 13, 23}

Output: 5
Explanation: Here, Fibonacci series will be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
Numbers that are present in array are 2, 8, 5, 1, 13
Example 2:
Input: N = 4, arr[] = {4, 7, 6, 25}
Output: 0
Explanation: No Fibonacci number in
this array.
*/
import java.util.Scanner;
class Q40FibonacciInArr{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int count=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                	
			int num1=0;
			int num2=1;
			int result=0;
			if(num1==arr[i] || num2==arr[i]){
				count++;
				continue;
			}
			while(result<=arr[i]){
				result=num1+num2;
				num1=num2;
				num2=result;
				if(result==arr[i])
					count++;
			}
		}
		System.out.println("The no. of Fibonacci in array are: "+count);
	}
}


