/*
 21] First element to occur k times

Given an array of N integers. Find the first element that occurs at least K number
of times.
Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
Explanation:
Both 7 and 4 occur 2 times.
But 4 is first that occurs 2 times
As at index = 4, 4 has occurred
at least 2 times whereas at index = 6,
7 has occurred at least 2 times.
*/
import java.util.*;
class Q21FirstEleOcckTimes{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter k element: ");
                int k=sc.nextInt();
	        boolean flag =false;	
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<=i;j++){

				if(arr[i]==arr[j]){
					count++;
			}
			if(k==count){
				System.out.println("the first element that occurs at least K number of times is : "+arr[i]);
				flag=true;
				break;
			}
			}
			if(flag)
				break;
		
		}
	}
}



