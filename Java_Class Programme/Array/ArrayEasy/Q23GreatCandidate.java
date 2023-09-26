/*
 Que 23 : Three Great Candidates
The hiring team aims to find 3 candidates who are great collectively. Each candidate has
his or her ability expressed as an integer. 3 candidates are great collectively if product of
their abilities is maximum. Given abilities of N candidates in an array arr[], find the
maximum collective ability from the given pool of candidates.

Example 1:
Input:
N = 5
Arr[] = {10, 3, 5, 6, 20}
Output: 1200
Explanation:
Multiplication of 10, 6 and 20 is 1200.

Example 2:
Input:
N = 5
Arr[] = {-10, -3, -5, -6, -20}
Output: -90
Explanation:
Multiplication of -3, -5 and -6 is -90.
*/
import java.util.*;
class Q23GreatCandidate{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Maximun mutiplication is: "+(arr[0]*arr[1]*arr[2]));
	}
}
