/*
 Que 5 : Peak Elements
An element is called a peak element if its value is not smaller than the value of its
adjacent elements(if they exist).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct.
Otherwise output will be 0.

Example 1:
Input:
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3. It is the peak element as it is greater than its neighbor
2. If 2 is returned then the generated output will be 1 else 0.

Example 2:
Input:
N = 3
arr[] = {3,4,2}
Possible Answer: 1
Output: 1
Explanation: 4 (at index 1) is the peak element as it is greater than it's neighbor
elements 3 and 2. If 1 is returned then the generated output will be 1 else 0.
*/
import java.util.*;
class Q5PeakEle{
        public static void main(String [] args){
		int index=0;
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		//System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			try{
			if(i==0 && arr[i]>arr[i+1]){
				index=i;
				continue;
			}
			if(i==arr.length-1 && arr[i]>arr[i-1]){
				index=i;
				continue;
			}
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
				index=i;
			}
			}catch(ArrayIndexOutOfBoundsException aiobe){
			}
		}
		System.out.println("Output: "+index);
	}
}
