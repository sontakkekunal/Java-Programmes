//Write a program to print a table of N
import java.util.Scanner;
class TableOfN{
	public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  number for getting its table ");
                int N=input.nextInt();
		for(int i=N;i<=(N*10);i=i+N){
			System.out.println(i);
		}
	}
}

