/*
 26] Positive and negative elements

Given an array arr[ ] containing equal number of positive and negative elements,
arrange the array such that every positive element is followed by a negative
element.
Note- The relative order of positive and negative numbers should be maintained.
Example 1:
Input:
N = 6
arr[] = {-1, 2, -3, 4, -5, 6}
Output:
2 -1 4 -3 6 -5
Explanation: Positive numbers in order are 2, 4 and 6. Negative numbers in
order are -1, -3 and -5. So the arrangement we get is 2, -1, 4, -3, 6 and -5.
Example 2:
Input:
N = 4
arr[] = {-3, 2, -4, 1}
Output:
2 -3 1 -4
*/
import java.util.*;
class Q26PosticNegaNum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                int count1=0;
		int count2=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			if(arr[i]>0)
				count1++;
			if(arr[i]<0)
				count2++;
			if(arr[i]==0)
				throw new RuntimeException("Dont enter 0");
		}
		if(count1!=count2)
			throw new RuntimeException("Enter amount of negative and Postive num");
		
		int n1=0;
		int n2=1;
		for(int i=0;i<arr.length/2;i++){
			if(arr[n1]<0 && arr[n2]>0){
				int temp=arr[n1];
				arr[n1]=arr[n2];
				arr[n2]=temp;
			}
			n1=n1+2;
			n2=n2+2;
		}
		System.out.println("Rearragnement is : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}



