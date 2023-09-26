/*
 13 : Minimum distance between two number
You are given an array A, of N elements. Find minimum index based distance between
two elements of the array, x and y such that (x!=y).

Example 1:
Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are two distances between x and y, which are
1 and 3 out of which the least is 1.

Example 2:
Input:
N = 7
A[] = {86,39,90,67,84,66,62}
x = 42, y = 12
Output: -1
Explanation: x = 42 and y = 12. We return -1 as x and y don't exist in the array.
*/
import java.util.Scanner;
class Q13MiniDistance{
	static int miniDist(int arr[],int x,int y){
		boolean flag1=true;
		boolean flag2=true;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x && flag1){
				flag1=false;
				x=i;
			}
			if(arr[i]==y && flag2){
				flag2=false;
				y=i;
			}
		}
		if(flag1 || flag2)
			return -1;
		else
			return y-x;
	}
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
		System.out.println("Enter y: ");
		int y=sc.nextInt();
		System.out.println("min distance in index is: "+Q13MiniDistance.miniDist(arr,x,y));
	}
}
