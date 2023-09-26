/*
 Que 22 : Left most and right most index

Given a sorted array with possibly duplicate elements. The task is to find indexes of first
and last occurrences of an element X in the given array.
Note: If the element is not present in the array return {-1,-1} as a pair.

Example 1:
Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of the first occurrence of 5 is 2 and the index of the last occurrence of 5 is 5.

Example 2:
Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 7, 123, 125}
X = 7
Output:
6 6
*/
import java.util.*;
class Q22LeftRightMostIndex{
	int[] leftRightMostIndex(int [] arr,int x){
		int[] ind= new int[]{-1,-1};
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				ind[0]=i;
				break;
			}
		}
		for(int j=arr.length-1;j>=0;j--){
			if(arr[j]==x){
				ind[1]=j;
				break;
			}
		}
		return ind;
	}
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		System.out.println("Eneter Element to find index from first and last: ");
		int x=sc.nextInt();
		Q22LeftRightMostIndex obk = new Q22LeftRightMostIndex();
		System.out.println("Left and right most index are "+obk.leftRightMostIndex(arr,x)[0]+" , "+obk.leftRightMostIndex(arr,x)[1]+" respectively");
	}
}


