//Write a program to print a table of N in reverse order.
import java.util.Scanner;
class ReverseTableOfN{
	public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  number for getting its table in reverse order ");
                int N=input.nextInt();
		for(int i=(N*10);i>0;i=i-N){
			System.out.println(i);
		}
	}
}

