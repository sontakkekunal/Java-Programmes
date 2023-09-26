/*
 Que 12 : Number of occurance
Given a sorted array Arr of size N and a number X, you need to find the number of
occurrences of X in Arr.

Example 1:
Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.

Example 2:
Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the given array.
*/
import java.util.Scanner;
class Q12NumOfOccence{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter X: ");
                int x=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(x==arr[i])
				count++;
		}
		System.out.println("Num of occrance of "+x+" is: : "+count);
	}
}
