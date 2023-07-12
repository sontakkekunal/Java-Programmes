//write prime number checking programme using break statement
import java.util.Scanner;
class PrimeNumUsingBreak{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for checking prime or not ");
		int N=input.nextInt();
		int count=0;
		int i=N;
		while(i>=1){
			if(N%i==0)
				count++;
			if(count>2){
				System.out.println(N+" is not a prime number");
				break;
			}
			i--;
		}
		if(count==2)
			System.out.println(N+" is a prime number");
		if(count==1)
                        System.out.println(N+" is neither prime or composite");

	}
}


