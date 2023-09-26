/*
 13] Find unique element

Given an array of size n which contains all elements occurring in multiples of K,
except one element which doesn't occur in multiple of K. Find that unique element.
Example 1:
Input :
n = 7, k = 3
arr[] = {6, 2, 5, 2, 2, 6, 6}
Output :
5
Explanation:
Every element appears 3 times except 5.
Example 2:
Input :
n = 5, k = 4
arr[] = {2, 2, 2, 10, 2}
Output :
10
Explanation:
Every element appears 4 times except 10.
*/
import java.util.*;
class Q13UniqueNotMultipleEle{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size =sc.nextInt();
                int A[] = new int[size];
                System.out.println("Enter array: ");
                for(int i=0;i<A.length;i++){
                        A[i]=sc.nextInt();
                }
		System.out.println("Enter Mutiple to chacek: ");
		int k=sc.nextInt();
		System.out.println("unique numner is : ");
		for(int i=0;i<A.length;i++){
                        if(A[i]>k && A[i]%k!=0)
				System.out.println(A[i]);
                }
	}
}


