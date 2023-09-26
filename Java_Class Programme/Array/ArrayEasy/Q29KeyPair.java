/*
 Que 29 : Key Pair
Given an array Arr of N positive integers and another number X. Determine whether or
not there exist two elements in Arr whose sum is exactly X.
Example 1:
Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:
Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
*/
import java.util.*;
class Q29KeyPair{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter arry : ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		System.out.println("Enter Sum to find pair: ");
		int sumf=sc.nextInt();
		int n=size;
		int i=0;
		int j=0;
		boolean flag=false;
		for(int m=1;m<=size*size;m++){
			if((arr[i]+arr[j])==sumf){
				flag=true;
			}
			j++;
			if(m==n){
				n=size+n;
				i++;
				j=0;
			}
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
			
				

