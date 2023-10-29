//Q. 1Write a program to print the factorial of a given number.
import java.util.Scanner;
class Q1FactorialOfGivenNum{
	int factorial(int num){
		if(num==1)
			return 1;
		return num*factorial(--num);
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num: ");
		int num=sc.nextInt();
		System.out.println("OoutPut: "+new Q1FactorialOfGivenNum().factorial(num));
	}
}
