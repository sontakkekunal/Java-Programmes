//Write a program to print the sum of the first N number.
import java.util.Scanner;
class SumOfFirstN{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter postive  number for sum till that number  ");
		int N=input.nextInt();
		if(N<0){
			System.out.println("Negative number "+N+" is converted to postive "+(-N));
			N=-N;
		}
		else if(N==0){
			System.out.println(" please enter postive or negative number,\n Zero is not postive nor Negative");
			main(null);
		}
		int sum=0;
		//(int i=N;i>0;i-i--)
		for(int i=1;i<=N;i++){
			sum=sum+i;
		}
		System.out.println(" Sum of number till "+N+" is "+sum);
	}
}

			
