//Write  a program to print reverse from N-1
import java.util.Scanner;
class ReverseFromNTo1{
	public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  postive number for getting reverse till 1");
                int N=input.nextInt();
		if(N<0){
			System.out.println("Negative number "+N+" is converted to postive "+(-N));
			N=-N;
		}
		else if(N==0){
			System.out.println(" please enter postive or negative number,\n Zero is not postive nor Negative");
			main(null);
		}
		System.out.println("Reverse from "+N+" to 1 is ");
		//(  ;N>=1;N--)
		for( ;N>0;N--){
			System.out.println(N);
		}

	}
}
