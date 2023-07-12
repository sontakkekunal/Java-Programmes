//Take N as input . Print its factor
//Input :- 6
//Output:- 1,2,3,6
import java.util.Scanner;
class PrintFactorOfN{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for getting its factor ");
		int N=input.nextInt();
		int temp=N;
		//( :N>0;N--)
		//( ;N>=1;N--)
		for(;N!=0;N--){
			if(temp%N==0)
				System.out.println(N+ " is factor of "+temp);
		}
	}
}
