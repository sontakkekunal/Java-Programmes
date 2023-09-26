/*
24] Ceil The Floor

Given an unsorted array Arr[] of N integers and an integer X, find floor and ceiling
of X in Arr[0..N-1].
Floor of X is the largest element which is smaller than or equal to X. Floor of X
doesn’t exist if X is smaller than the smallest element of Arr[].
Ceil of X is the smallest element which is greater than or equal to X. Ceil of X
doesn’t exist if X is greater than the greatest element of Arr[].
Example 1:
Input:
N = 8, X = 7
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
Output: 6 8
Explanation:
Floor of 7 is 6 and ceil of 7 is 8.

Example 2:
Input:
N = 8, X = 10
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
Output: 9 -1
Explanation:
Floor of 10 is 9 but ceil of 10 is not possible.
*/
import java.util.*;

class Q24SeilFloor{
	int floor(int x,int[] arr){
		boolean flag=true;
		int value=-1;
		int diff=0;
		for(int i=0;i<arr.length;i++){
			if(x>arr[i]){
				if(flag==true){
					diff=x-arr[i];
					value=arr[i];
					flag=false;
				}
				if((x-arr[i])<diff){
					diff=x-arr[i];
					value=arr[i];
				}
			}
		}
		return value;
	}
	int ceil(int x,int[] arr){
		boolean flag=true;
                int value=-1;
                int diff=0;
		for(int i=0;i<arr.length;i++){
			if(x<arr[i]){
                                if(flag==true){
                                        diff=arr[i]-x;
                                        value=arr[i];
                                        flag=false;
                                }
                                if((arr[i]-x)<diff){
                                        diff=arr[i]-x;
                                        value=arr[i];
                                }
                        }
                }
                return value;
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
		System.out.println("Enter X for searching ceil and floor: ");
		int x=sc.nextInt();
		Q24SeilFloor obj = new Q24SeilFloor();
		System.out.println("Floor of "+x+" is: "+obj.floor(x,arr));
		System.out.println("Celi  of "+x+" is: "+obj.ceil(x,arr));
	}
}


