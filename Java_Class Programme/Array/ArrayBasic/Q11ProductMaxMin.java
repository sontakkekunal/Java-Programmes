/*
 11] Product of maximum in first array and minimum in second

Given two arrays of A and B respectively of sizes N1 and N2, the task is to
calculate the product of the maximum element of the first array and minimum
element of the second array.
Example 1:
Input : A[] = {5, 7, 9, 3, 6, 2},
B[] = {1, 2, 6, -1, 0, 9}
Output : -9
Explanation:
The first array is 5 7 9 3 6 2.
The max element among these elements is 9.
The second array is 1 2 6 -1 0 9.
The min element among these elements is -1.
The product of 9 and -1 is 9*-1=-9.
Example 2:
Input : A[] = {0, 0, 0, 0},
B[] = {1, -1, 2}
Output : 0
*/
import java.util.*;
class Q10MaxOddSum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size =sc.nextInt();
                int A[] = new int[size];
		System.out.println("Enter seconf size of array: ");
		int size1=sc.nextInt();
		int B[]= new int[size1];
		System.out.println("Enter element in first array: ");
		int max=0;
		for(int i=0;i<A.length;i++){
                        A[i]=sc.nextInt();
			if(i==0){
				max=A[0];
				continue;
			}
			if(max<A[i])
				max=A[i];
                }
		System.out.println("Enter element in second array: ");
		int min=0;
		for(int i=0;i<B.length;i++){
                        B[i]=sc.nextInt();
			if(i==0){
				min=B[0];
				continue;
			}
			if(min>B[i])
				min=B[i];
                }
		System.out.println("Product of max and min in arrays is: "+(max*min));
	}
}

