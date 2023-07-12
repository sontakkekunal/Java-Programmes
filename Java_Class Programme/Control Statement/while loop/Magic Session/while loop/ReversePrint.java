//Write a program to reverse the given number.
import java.util.Scanner;
class ReversePrint{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for reversing it ");
		int N=input.nextInt();
		int reverse=0;
		while(N!=0){
			int temp=N%10;
			reverse=reverse*10+temp;
			N=N/10;
		}
		System.out.println("Reverse of number is "+reverse);
	}
}
