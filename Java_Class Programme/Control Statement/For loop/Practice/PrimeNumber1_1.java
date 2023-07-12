//Take N as input .print whether its prime or not
//If Number (from 1 To N) is divisble by 1 and itself is called Prime number.
//Actual definition:- The numner having only two factor is prime number
import java.util.Scanner;
class PrimeNumber{
        public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  number for checking prime or not ");
                int N=input.nextInt();
                int count=0;
		int temp=N;
		//( ;temp>=1;temp--)
		for( ;temp>0;temp--){
			if(N%temp==0)
				count++;
		}
		if(count==2)
			System.out.println(N+" is a prime number");
		else
			System.out.println(N+" is not a prime number");
	}
}

