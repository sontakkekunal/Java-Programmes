//Take N as input .print odd number till N
import java.util.Scanner;
class PrintOddTillN{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for getting odd till that number ");
		int N=input.nextInt();
		for(int i=1;i<=N;i=i+2){
			System.out.println(i);
		}
	}
}

