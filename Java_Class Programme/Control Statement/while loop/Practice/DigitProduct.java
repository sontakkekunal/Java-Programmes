//Given an integer N,print product of its digit. Assume N>0.
import java.util.Scanner;
class DigitProduct{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to form product of its digit ");
		int N=input.nextInt();
		int product=1;
		//(N>0)
		//(N>=1)
		while(N!=0){
			int temp=N%10;
			product=product*temp;
			N=N/10;
		}
		System.out.println("Mutipliction of number is "+product);
	}
}

