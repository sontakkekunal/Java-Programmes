/*
 16] Last index of One
Given a string S consisting only '0's and '1's, find the last index of the '1' present in
it.
Example 1:
Input:
S = 00001
Output:
4
Explanation:
Last index of 1 in the given string is 4.

Example 2:
Input:
0
Output:
-1
Explanation:
Since, 1 is not present, so output is -1.
*/
import java.util.*;
class Q16LastIndexOf1{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter String : ");
		String str=sc.nextLine();
		System.out.println(str.lastIndexOf("1"));
	}
}
		

