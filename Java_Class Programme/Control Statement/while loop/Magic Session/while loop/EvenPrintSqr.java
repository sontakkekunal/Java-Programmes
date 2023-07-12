//Write a program to print the square of even digit of the given number
import java.util.Scanner;
class EvenPrintsqr{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for squaring even digit ");
		int N=input.nextInt();
		int temp=N;
		while(temp!=0){
			int rem=temp%10;
			if(rem%2==0)
				System.out.println("Square of even number "+rem+" from digit "+N+" is "+(rem*rem));
			temp=temp/10;
		}
	}
}


