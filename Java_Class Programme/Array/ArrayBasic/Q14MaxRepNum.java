/*
 14] Maximum repeating number

Given an array Arr of size N, the array contains numbers in range from 0 to K-1
where K is a positive integer and K <= N. Find the maximum repeating number in
this array. If there are two or more maximum repeating numbers return the element
having least value.
Example 1:
Input:
N = 4, K = 3
Arr[] = {2, 2, 1, 2}
Output: 2
Explanation: 2 is the most frequent element.
Example 2:
Input:
N = 6, K = 3
Arr[] = {2, 2, 1, 0, 0, 1}
Output: 0
Explanation: 0, 1 and 2 all have the same frequency of 2.But since 0 is
smallest, you need to return 0.
*/
import java.util.*;
/*
class InvalidData extends Exception{
	InvalidData(String str){
		super(str);
	}
}
*/
class Q14MaxRepNum{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size =sc.nextInt();
                int A[] = new int[size];
		System.out.println("Enter range : ");
                int k=sc.nextInt();
                System.out.println("Enter array: ");
                for(int i=0;i<A.length;i++){
                        A[i]=sc.nextInt();
			if(!(A[i]<k))
					throw new RuntimeException("PLesae give number in element lesser than rang");
                }
		int precount=0;
		int value=0;
		for(int i=0;i<A.length;i++){
			int count1=0;
			for (int j=0;j<A.length;j++){
				if(A[i]==A[j])
					count1++;
			}
			if(count1==precount){
				if(A[i]<value){
					value=A[i];
				}
				precount=count1;
			}
			else if(count1>precount){
				value=A[i];
				precount=count1;
			}
		}
		System.out.println("Repeating number is: "+value);
	}
}

