/*
 Que 9 : Find transition Point
Given a sorted array containing only 0s and 1s, find the transition point.
Example 1:
Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition point where 1 begins.

Example 2:
Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1", the answer is -1.
*/
import java.util.Scanner;
class Q9TrasionPoint{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		boolean flag=true;
		int value=-1;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			if(arr[i]==1 && flag){
				flag=false;
				value=i;
			}
                }
		System.out.println("Index at which first 1 is : "+value);
	}
}


