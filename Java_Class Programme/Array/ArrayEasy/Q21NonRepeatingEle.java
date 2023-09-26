/*
 Que 21 : Non Repeating Element
Find the first non-repeating element in a given array Arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

Example 1:
Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once.
Hence, the output is 3.

Example 2:
Input : arr[] = {1, 1, 1}
Output : 0
*/
import java.util.*;
class Q20ArrLargest{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[]=new int[size];
		int value=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			boolean flag=true;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					flag=false;
					break;
				}
			}
			if(flag && i!=0)
				value=arr[i];
		}
		System.out.println("Output: "+value);
	}
}
