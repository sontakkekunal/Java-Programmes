/*
 22] Jump Game
Given a positive integer N and a list of N integers A[]. Each element in the array
denotes the maximum length of jump you can cover. Find out if you can make it to
the last index if you start at the first index of the list.
Example 1:
Input:
N = 6
A[] = {1, 2, 0, 3, 0, 0}
Output:
1
Explanation:
Jump 1 step from first index to
second index. Then jump 2 steps to reach
4th index, and now jump 2 steps to reach
the end.
Example 2:
Input:
N = 3
A[] = {1, 0, 2}
Output:
0
Explanation:
You can't reach the end of the array.
*/
import java.util.*;
class Q22JumpGame{
	static int jumpGame(int arr[]){
		int i=0;
		boolean flag=false;
		while(i!=i+arr[i]){
			i=i+arr[i];
			if(i>=arr.length-1){
				flag=true;
				break;
			}
		}
		if(flag)
			return 1;
		else
			return 0;
	}
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Output: "+Q22JumpGame.jumpGame(arr));
	}
}
		

