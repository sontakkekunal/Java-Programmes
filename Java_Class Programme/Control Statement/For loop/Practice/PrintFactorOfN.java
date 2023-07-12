//Take N as input . Print its factor
//Input :- 6
//Output:- 1,2,3,6
import java.util.Scanner;
class PrintFactorOfN{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for getting its factor ");
		int N=input.nextInt();
		//(int i=1;i<(N+1):i++)
		for(int i=1;i<=N;i++){
			if(N%i==0)
				System.out.println(i+ " is factor of "+N);
		}

	}
}

