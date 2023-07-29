//Write a program to calculate the Factorial of given number.
import java.util.Scanner;
class Factorial{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for Factoiral ");
		int N=input.nextInt();
		int i=1;
		int fact=1;
		int temp=N;
		//(i<(N+1))
		while(i<=N){
			fact=fact*i;
			i++;
		}
		System.out.println("Factorail of "+temp+"! is "+fact);
	}
}

