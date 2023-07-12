//write a program to print till N. And if N is dividlbe by M then don't print that number i.e. skip that perticular number.
import java.util.Scanner;
class PrtTillNAndBreakIfDivByM{
	public static void main(String [] hh){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number to print till that number ");
		int N=input.nextInt();
		if(N<0){
			System.out.println("Negative number "+N+" is converted to postive "+(-N));
			N=-N;
		}
		else if(N==0){
			System.out.println(" please enter postive,\n Zero is not postive nor Negative");
			main(null);
		}
		System.out.println("Enter number for dividing  ");
                int M=input.nextInt();
		for(int i=1;i<=N;i++){
			if(i%M==0){
				System.out.println("Number skip");
				continue;
			}
			System.out.println(i);
		}
	}
}




