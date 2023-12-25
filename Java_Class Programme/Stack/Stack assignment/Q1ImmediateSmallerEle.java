/*
 1. Immediate Smaller Element
Given an integer array Arr of size N. For each element in the array, check whether the
right adjacent element (on the next immediate position) of the array is smaller. If next
element is smaller, update the current index to that element. If not, then -1.
Example 1:
Input:
N = 5
Arr[] = {4, 2, 1, 5, 3}
Output:
2 1 -1 3 -1
Explanation: Array elements are 4, 2, 1, 5
3. Next to 4 is 2 which is smaller, so we
print 2. Next of 2 is 1 which is smaller,
so we print 1. Next of 1 is 5 which is
greater, so we print -1. Next of 5 is 3
which is smaller, so we print 3. Note
that for last element, output is always
going to be -1 because there is no element
on right.
Example 2:
Input:
N = 6
Arr[] = {5, 6, 2, 3, 1, 7}
Output:
-1 2 -1 1 -1 -1
Explanation: Next to 5 is 6 which is
greater, so we print -1.Next of 6 is 2
which is smaller, so we print 2. Next
of 2 is 3 which is greater, so we
print -1. Next of 3 is 1 which is
smaller, so we print 1. Next of 1 is
7 which is greater, so we print -1.
Note that for last element, output is
always going to be -1 because there is

no element on right.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 107
1 ≤ Arr[i] ≤ 105
*/
import java.util.Scanner;
import java.util.Stack;
class ImmediateSmallerEle{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Stack<Integer> s= new Stack<Integer>();
		s.push(arr[0]);
		int i=1;
		while(i<arr.length){
			if(s.peek()<arr[i]){
				arr[i-1]=-1;
			}
			else{
				arr[i-1]=arr[i];
			}
			s.push(arr[i]);
			i++;
		}
		arr[i-1]=-1;
		System.out.println("Ouput: ");
		for(int x=0;x<arr.length;x++){
                        System.out.print(arr[x]+" ");
                }
	}
}


