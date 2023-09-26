/*
 Que 16 : Rotation
Given an ascending sorted rotated array Arr of distinct integers of size N. The array is
right rotated K times. Find the value of K.

Example 1:
Input:
N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5.
We can see that the array was rotated 1 time to the right.

Example 2:
Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 0
Explanation: The given array is not rotated.
*/
import java.util.Scanner;
class Q16RoationFindk{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int arr1[]= new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			arr1[i]=arr[i];
                	for(int j=0;j<i;j++){
				if(arr1[i]<arr1[j]){
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		boolean flag=true;
		int diff1=0;
		int diff=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr1[i]==arr[j]){
					if(flag){
						diff1=j-i;
						flag=false;
					}
					diff=j-i;
					break;
				}
			}
			if(diff1!=diff){
				System.out.println("Rotation cannot be detected");
				break;
			}
		}
		System.out.println("Roation k is: "+diff1);
	}
}

