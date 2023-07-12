//Take N as input.Print  its Factorial
//input;-5
//output:-120
import java.util.Scanner;
class Factorial{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for getting its factorial ");
		int N=input.nextInt();
		int fact=1;
		//(;N>=1;N--)
		//(;N!=0;N--)
		for(;N>0;N--){
			fact=fact*N;
		}
		System.out.println("Factorail is "+fact);
	}
}
