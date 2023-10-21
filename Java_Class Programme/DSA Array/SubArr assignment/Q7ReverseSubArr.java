/*
 7) Reverse sub array
Provided an array Arr of N integers, you need to reverse a subarray of that
array. The range of this subarray is given by L and R.
Example 1:
Input:
N = 7
Arr[] = {1, 2, 3, 4, 5, 6, 7}
L = 2, R = 4
Output:
1 4 3 2 5 6 7
Explanation: After reversing the elements
in range 2 to 4 (2, 3, 4),
the modified array is 1, 4, 3, 2, 5, 6, 7.
Example 2:
Input:
N = 4

Arr[] = {1, 6, 7, 4}
L = 1, R = 4
Output:
4 7 6 1
Explanation: After reversing the elements
in range 1 to 4 (1, 6, 7, 4),
the modified array is 4, 7, 6, 1.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^7
1 ≤ Arr[i] ≤ 10^6
1 ≤ L ≤ R ≤ N
*/
import java.util.*;
class Q7ReverseSubArr{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter L: ");
		int l=sc.nextInt();
		System.out.println("Enter R: ");
		int r=sc.nextInt();
		l=l-1;
		r--;
		while(l<r){
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			r--;
			l++;
		}
		System.out.println("Output: ");
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
}

