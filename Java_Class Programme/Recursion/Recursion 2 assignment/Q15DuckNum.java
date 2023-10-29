/*
 Q. 15
Write a program to check if a given number is a Duck Number or not.
(A Duck Number is a number which doesn't start with a zero but has at least one
digit as zero.)
*/
import java.util.Scanner;
class Q15DuckNum{
	boolean duckNum(int num){
		if(num==0)
			return false;
		if(num%10==0)
			return true;
		return duckNum(num/10);
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		System.out.println("Output: "+new Q15DuckNum().duckNum(num));
	}
}
