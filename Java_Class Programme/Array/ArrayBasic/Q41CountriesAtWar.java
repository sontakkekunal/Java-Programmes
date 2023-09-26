/*
 41]Countries at war

The two countries of A and B are at war against each other. Both countries have N
number of soldiers. The power of these soldiers are given by A[i]...A[N] and
B[i]....B[N].
These soldiers have a peculiarity. They can only attack their counterpart enemies,
like A[i] can attack only B[i] and not anyone else. A soldier with higher power can
kill the enemy soldier. If both soldiers have the same power, they both die. You
need to find the winning country.
Example 1:
Input : a[ ] = {2, 2}, b[ ] = {5, 5}
Output : B
Explanation:
Both countries have 2 soldiers.
B[0] kills A[0], B[1] kills A[1].
A has 0 soldiers alive at the end.
B has both soldiers alive at the end.
Return "B" as a winner.
Example 2:
Input : a[ ] = {9}, b[ ] = {8}
Output : A
*/
import java.util.Scanner;
class Q40CountiesInWar{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter second Array: ");
                int arr1[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr1[i]=sc.nextInt();
                }
		int countA=0;
		int countB=0;
		for(int i=0;i<size;i++){
			if(arr[i]>arr1[i])
				countA++;
			if(arr[i]<arr1[i])
				countB++;
		}
		System.out.println((countA>countB)?("A win the war"):("B win the war"));
	}
}
