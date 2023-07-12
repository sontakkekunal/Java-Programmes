//write a program to check weather it is composite number or not
import java.util.Scanner;
class CompositeNumber{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for checking its composite or not ");
		int N=input.nextInt();
		int count=0;
		//for(int i=1;i<(N+1);i++){
		for(int i=1;i<=N;i++){
			if(N%i==0)
				count++;
		}
		if(count>2)
			System.out.println(N+ " is composite number");
		else
			System.out.println(N+ " is not a composite number");

		}	
}


