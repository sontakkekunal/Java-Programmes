/*
 1. Reverse Integer (Leetcode:- 7)

Given a signed 32-bit integer x, return x with its digits reversed. If reversing
x causes the value to go outside the signed 32-bit integer range [-231, 231
- 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed
or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21

Constraints:
-231 <= x <= 231 - 1
*/
import java.util.*;
class Q1ReverseInteger{
	static reverseInteger(int x){  //TC---> O(log base 10 N)  --> O(log(10N))
				       //Sc---> O(1)
		if(x>-231 && x<231-1){
			int val=0;
			while(x!=0){
				val=val*10+(x%10);
				x=x/10;
			}
			return val;
		}
		else{
			return 0;
		}
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to reverse: ");
		System.out.println("Note: the environment does not allow you to store 64-bit integers");
		int x=sc.nextInt();
		System.out.println("Reverse Intger is: "+Q1ReverseInteger.reverseInteger(x));
	}
}

