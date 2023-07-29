//Print table of N.
import java.util.Scanner;
class Table{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for tabele ");
		int N=input.nextInt();
		System.out.println("Enter number till you want table ");
                int M=input.nextInt();
		int i=0;
		System.out.println("Tabel of "+N+" till "+M+" is ");
		while(i<(M*N)){
			System.out.println(i=i+N);

		}
	}
}


