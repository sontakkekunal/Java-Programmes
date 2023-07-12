//take an integer N as input.
//Print perfect square till n perfect sqaure.
//An integer whose square root is a integer.
import java.util.Scanner;
class Sqrroot{
	public static void main(String [] args){
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter a number to calculate and  print perfect square till that number ");
		int  N=obj.nextInt();
		int temp=N;
		while(temp>0){
			if(temp*temp<=N)
				System.out.println("Perfect square till "+N+" are "+ (temp*temp));
			temp--;
		}
	}
}

