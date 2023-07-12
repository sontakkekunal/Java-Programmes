//Take N as input .Print count of factor.
import java.util.Scanner;
class FactorCountOfN{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for getting count of factor ");
		int N=input.nextInt();
		int count=0;
		for(int i=1;i<=N;i++){
			if(N%i==0)
				count++;
		}
		System.out.println("Factor in "+N+" are "+count);
	}	
}

