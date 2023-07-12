//Write a program to find count the odd digit in given no.
import java.util.Scanner;
class Factorial{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for finding odd digit in number ");
		int N=input.nextInt();
		int temp=N;
		int count=0;
		//(temp1=0)
		//(temp>=1)
		while(temp>0){
			int rem=temp%10;
			if(rem%2==1)
				count++;
			temp=temp/10;
		}
		System.out.println("No. of odd digit count in "+N+" is "+count);
	}
}


