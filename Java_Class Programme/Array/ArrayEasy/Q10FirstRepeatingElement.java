/*
 Que 10 : First Repeating Element
Given an array arr[] of size n, find the first repeating element. The element should occur
more than once and the index of its first occurrence should be the smallest.
Note:- The position you return should be according to 1-based indexing.

Example 1:
Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation: 5 is appearing twice and its first appearance is at index 2 which is
less than 3 whose first occurring index is 3.

Example 2:
Input:
n = 4
arr[] = {1, 2, 3, 4}
Output: -1
Explanation: All elements appear only once so the answer is -1.
*/
import java.util.Scanner;
class Q10FirtsTeapeadingEle{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int flag1=arr.length-1;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			int flag=-1;
                	for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					flag=j;
				}
			}
			if(flag<flag1 && flag!=-1){
				flag1=flag;
			}
		}
		if(flag1==arr.length-1)
			flag1=-1;
		System.out.println("Output: "+flag1);
	}
}


			
