/*
 Q. 7
Write a program to check if a given number is a Magic Number or not. (A Magic
Number is a number in which the eventual sum of the digits is equal to 1).
*/
import java.util.Scanner;
class Q7MagicNum{
	int sumOfDigit(int num){
		if(num==0)
			return 0;
		return (num%10)+sumOfDigit(num/10);
	}
	int magicNum(int num){
		if(num<10 && num>-10)
			return num;
		return magicNum(sumOfDigit(num));
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
		if(new Q7MagicNum().magicNum(num)==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
