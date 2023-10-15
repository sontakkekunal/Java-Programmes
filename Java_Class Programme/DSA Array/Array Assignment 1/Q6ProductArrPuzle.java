/*
 Q6. Product array puzzle
Problem Description
- Given an array of integers A, find and return the product array of the same
size where the ith element of the product array will be equal to the

product of all the elements divided by the ith element of the array.

- Note: It is always possible to form the product array with integer (32 bit)
values. Solve it without using the division operator.

Constraints
2 <= length of the array <= 1000
1 <= A[i] <= 10
For Example
Input 1:
A = [1, 2, 3, 4, 5]
Output 1:
[120, 60, 40, 30, 24]
Input 2:
A = [5, 1, 10, 1]
Output 2:
[10, 50, 5, 50]
*/
import java.util.*;
class Q6ProductArrPuzle{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                int product=1;
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
			product=product*arr[i];
		}
		int puzzArr[]= new int[N];
		System.out.println("Output: ");
		for(int i=0;i<N;i++){
			int count=0;
			int divisor=arr[i];
			while(divisor<=product){
				count++;
				divisor=divisor+arr[i];
			}
			puzzArr[i]=count;
			System.out.println(puzzArr[i]);
		}
	}
}



