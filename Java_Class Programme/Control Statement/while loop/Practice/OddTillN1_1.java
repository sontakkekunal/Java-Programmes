//Take an integer N as input .Print odd integer from 1 to N using while loop.
import java.util.Scanner;
class OddTillN{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number N");
	        int N=obj.nextInt();
		while(N>0){
			if(N%2==1){
				System.out.println("Odd number is " + N);
			}
			N--;
		}
	}
}
