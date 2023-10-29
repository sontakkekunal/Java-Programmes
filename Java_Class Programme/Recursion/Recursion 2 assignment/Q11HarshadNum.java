/*
 Q. 11
Write a program to check if a given number is a Harshad Number or not.
(A Harshad Number is a number that is divisible by the sum of its digits.)
*/
import java.util.Scanner;
class Q11HarshadNum{
	int sumOfDigit(int num){
		if(num==0)
			return 0;
		return (num%10)+sumOfDigit(num/10);
	}
	boolean harshadNum(int num){
		if(num%sumOfDigit(num)==0)
			return true;
		else
			return false;
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
		System.out.println("Ouput: "+new Q11HarshadNum().harshadNum(num));
	}
}
