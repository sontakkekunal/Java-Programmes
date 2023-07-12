import java.util.Scanner;
class IfNegaThenPos{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number ");
		int N=input.nextInt();
		if(N<0){
			System.out.println("Negative number "+N+" is converted to postive "+(-N));
			N=-N;
		}
		else if(N==0){
			System.out.println(" please enter postive or negative number,\n Zero is not postive nor Negative");
			main(null);
		}
		System.out.println("Postive number is "+N);
	}
}
