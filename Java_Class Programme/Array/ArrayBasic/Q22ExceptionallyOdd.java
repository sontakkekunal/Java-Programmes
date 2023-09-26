/*
 22] Exceptionally odd

Given an array of N positive integers where all numbers occur even number of
times except one number which occurs odd number of times. Find the exceptional
number.
Example 1:
Input:
N = 7
Arr[] = {1, 2, 3, 2, 3, 1, 3}
Output: 3
Explanation: 3 occurs three times.
Example 2:
Input:
N = 7
Arr[] = {5, 7, 2, 7, 5, 2, 5}
Output: 5
Explanation: 5 occurs three times.
*/
import java.util.*;
class Q22ExcetionnlluOdd{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		for(int i=0;i<arr.length;i++){
			int count=0;
                        for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count%2==1){
				System.out.println("Odd value is : "+arr[i]);
				break;
			}
		}
	}
}

