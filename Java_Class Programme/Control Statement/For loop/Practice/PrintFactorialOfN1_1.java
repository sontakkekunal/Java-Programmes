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
		for(int i=1;i<=N;i++){
			fact=fact*i;
		}
		System.out.println("Factoial of "+N+" is "+fact);
	}
}

