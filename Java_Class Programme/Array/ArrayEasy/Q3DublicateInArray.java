/*
 Que 3 : Find Duplicates in an Array
Given an array of size N which contains elements from 0 to N-1, you need to find all the
elements occurring more than once in the given array. Return the answer in ascending
order. If no such element is found, return list containing [-1].
Note: The extra space is only for the array to be returned. Try and perform all operations
within the provided array.

Example 1:
Input:
N = 4
a[] = {0,3,1,2}
Output:
-1
Explanation:
There is no repeating element in the array. Therefore output is -1.

Example 2:
Input:
N = 5
a[] = {2,3,1,2,3}
Output:
2 3
Explanation:
2 and 3 occur more than once in the given array.
*/
import java.util.Scanner;
class Q3DublicateInArray{
	static String dublicateDetect(int[] arr){
		String str=" ";
		for(int i=0;i<arr.length;i++){
			boolean flag=false;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					flag=true;
					break;
				}
			}
			if(flag)
				str=str+arr[i]+" ";
		}
		if(str==" ")
			return "-1";
		else
			return str;
	}
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		System.out.println("Dubliacte: "+Q3DublicateInArray.dublicateDetect(arr));
	}
}

