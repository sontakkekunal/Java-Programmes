//Take N as input .print odd number till N
import java.util.Scanner;
class PrintOddTillN{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for getting odd till that number ");
		int N=input.nextInt();
		//(int i=0;i<N;i++)
		//(int i=1:i<(N+1);i++)
		for(int i=1;i<=N;i++){
			if(i%2==1)
				System.out.println(i);
		}
	}
}

