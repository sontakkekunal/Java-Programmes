//Take N as input.print from 1 to N.
import java.util.Scanner;
class EvenSumOddProduct{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter postive number for print till there from 1 ");
		int N=input.nextInt();
		if(N<0){
			System.out.println("Negative number "+N+" is converted to postive "+(-N));
			N=-N;
		}
		else if(N==0){
			System.out.println(" please enter postive or negative number,\n Zero is not postive nor Negative");
			main(null);
		}
		//(int i=0;i<N;i++)
         	for(int i=1;i<=N;i++){
                	System.out.println(i);
		}	
	}
}
