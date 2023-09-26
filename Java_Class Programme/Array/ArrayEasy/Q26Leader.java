/*
 Que 26 : Leaders in an Array
Given an array A of positive integers. Your task is to find the leaders in the array. An
element of an array is leader if it is greater than or equal to all the elements to its right
side. The rightmost element is always a leader.
Example 1:
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 as it is greater than all the elements to its right.
Similarly, the next leader is 5. The right most element is always a leader so it is
also included.
Example 2:
Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
Explanation: The first leader is 4 as all the other numbers aren't greater than the
other elements to their right side. The second leader is 0 as there are no elements at
the right side so it's greater itself.
*/
import java.util.Scanner;
class Q26LeaderInArray{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Output");
		for(int i=0;i<arr.length;i++){
			boolean flag =true;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(arr[i]+" ");
		}
	}
}

