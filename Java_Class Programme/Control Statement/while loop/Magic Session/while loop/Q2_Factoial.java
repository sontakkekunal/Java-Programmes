//Write a program to calculate the Factorial of given number.
import java.util.Scanner;
class Factorial{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for factoial ");
		int N=input.nextInt();
		//(N!=0)
		//(N>0)
		int temp=N;
		int fact=1;
		while(N>=1){
			fact=fact*N;
			N--;
		}
		System.out.println("Factorail of "+temp+"! is "+fact);
	}
}



