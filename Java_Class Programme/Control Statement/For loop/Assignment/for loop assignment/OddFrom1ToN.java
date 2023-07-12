//write a program to print odd number 1-N
import java.util.Scanner;
class OddFrom1ToN{
	public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  postive number for printing odd till that number");
                int N=input.nextInt();
		if(N<0){
			System.out.println("Negative number "+N+" is converted to postive "+(-N));
			N=-N;
		}
		else if(N==0){
			System.out.println(" please enter postive or negative number,\n Zero is not postive nor Negative");
			main(null);
		}
		System.out.println("Odd number from 1 to "+N+" is ");
		//(int i=1;i<(N+1);i++)
		for(int i=1;i<=N;i++){
			if(i%2==1)
				System.out.print(i+" ");
		}
	}
}
