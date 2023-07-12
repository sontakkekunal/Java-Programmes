//Given an integer N.print all its digit
import java.util.Scanner;
class PrintDigit{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number N");
	        int N=obj.nextInt();
		//(N>0)
		//(N>=1)
		while(N!=0){
			int temp=N%10;
			System.out.println(temp+" is indevitual digit");
			N=N/10;
		}
	}
}
