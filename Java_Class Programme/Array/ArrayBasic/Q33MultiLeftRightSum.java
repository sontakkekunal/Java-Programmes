
/*
 33] Multiply left and right array sum.

Pitsy needs help with the given task by her teacher. The task is to divide an array
into two sub-array (left and right) containing n/2 elements each and do the sum of
the subarrays and then multiply both the subarrays.
Note: If the length of the array is odd then the right half will contain one element
more than the left half.
Example 1:
Input : arr[ ] = {1, 2, 3, 4}
Output : 21
Explanation:
Sum up an array from index 0 to 1 = 3. Sum up an array from index 2 to 3 =
7. Their multiplication is 21.
Example 2:
Input : arr[ ] = {1, 2}
Output : 2
*/
import java.util.*;
class Q33MutlLeftRightSum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int left=0;
		int right=0;
		int size1=(int)size/2;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			if(i<size1){
				left=left+arr[i];
			}
			else{
				right=right+arr[i];
			}
		}
		System.out.println("Output :- "+(left*right));
	}
}
