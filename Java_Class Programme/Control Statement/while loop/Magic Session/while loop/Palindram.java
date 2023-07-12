//Write a program to check weather the no. is palindram.
import java.util.Scanner;
class Palindram{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for checking it is palindram or not ");
		int N=input.nextInt();
		int temp=N;
		int rev=0;
		//(temp>0)
		//(temp>=1)
		while(temp!=0){
			int temp1=temp%10;
			rev=rev*10+temp1;
			temp=temp/10;
		}
		if(N==rev)
			System.out.println(N+" is a palindram number");
		else
			System.out.println(N+" is not a palindram number");
	}
}


