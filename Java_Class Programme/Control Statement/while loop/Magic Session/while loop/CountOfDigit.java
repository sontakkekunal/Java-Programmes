//Write a program to count the digit of given no. 
import java.util.Scanner;
class Factorial{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for digit count  ");
		int N=input.nextInt();
		int temp=N;
		int count=0;
		//(temp>0)
		//(temp>=1)
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		System.out.println("No. of digits in "+N+" is "+count);
	}
}

