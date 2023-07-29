//Print table of N.
import java.util.Scanner;
class Table{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for tabele ");
		int N=input.nextInt();
		System.out.println("Enter number till you want table ");
                int M=input.nextInt();
		int i=1;
		while(i<=M){
			System.out.println(N+" x "+i+" = "+(N*i));
		i++;
		}
	}
}
