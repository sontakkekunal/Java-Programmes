//write a program to check weather it is composite number or not
import java.util.Scanner;
class CompositeNumber{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for checking its composite or not ");
		int N=input.nextInt();
		int count=0;
		int i=1;
		while(i<=N){
			if(N%i==0)
				count++;
			i++;
		}
		if(count>2)
			System.out.println(N+ " is composite number");
		else
			System.out.println(N+ " is not a composite number");
	}
}

