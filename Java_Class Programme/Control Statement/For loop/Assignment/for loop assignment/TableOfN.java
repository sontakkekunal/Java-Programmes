//Write a program to print a table of N
import java.util.Scanner;
class TableOfN{
	public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  number for getting its table ");
                int N=input.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(N+" x "+i+" = "+(N*i));
		}
	}
}

