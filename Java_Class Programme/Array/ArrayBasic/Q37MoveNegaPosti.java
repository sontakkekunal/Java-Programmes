/*
 37] Move all negative numbers to beginning and positive to end
with constant extra space
An array contains both positive and negative numbers in random order. Rearrange
the array elements so that all negative numbers appear before all positive numbers.
Examples :
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
*/
import java.util.Scanner;
class Q37MoveNegaPosti{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                int arr1[]= new int[size];
		int m=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				arr1[m]=arr[i];
				m++;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				arr1[m]=arr[i];
				m++;
			}
		}
		System.out.println("Output: =");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
	}
}

