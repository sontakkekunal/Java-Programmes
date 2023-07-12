//take an integer N as input.
//Print perfect square till n perfect sqaure.
//An integer whose square root is a integer.
import java.util.Scanner;
import java.lang.Math;
class Sqrroot{
	public static void main(String [] args){
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter a number to calculate and  print perfect square till that number ");
		double  N=obj.nextFloat();
		double i=1;
		while(N>=i){
			double value= Math.sqrt(i);
		        int IntegerValue=(int)value;
			if(value==IntegerValue)
				System.out.println("Perfect square till "+N+" are "+i);
			i++;
		}
	}
}



