//Armstrong number for three digit number using while loop.
import java.util.Scanner;
class ArmstrongNumberFor3Digit{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number 3 digit for checking it is armstrong or not ");
		int N=input.nextInt();
		int sum=0;
		int temp=N;
		//(temp>0)
		//(temp>=1)
		while(temp!=0){
			int value=temp%10;
			sum=sum+(value*value*value);
			temp=temp/10;
		}
		if(sum==N)
			System.out.println(N+" is a armstrong Number");
		else
			System.out.println(N+" is not armstrong Number");
	}
}
