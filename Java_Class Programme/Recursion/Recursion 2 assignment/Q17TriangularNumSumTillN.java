/*
 Q17.
Write a program to calculate and print the sum of the first N triangular numbers.
Take N as input from the user.
 */
import java.util.Scanner;
class Q17TriangularNumSumTillN{
	int i=0;
	int triangularNumSumtillN(int num){
		if(i==num)
			return 0;
		i++;
		return ((i*(i+1))/2)+triangularNumSumtillN(num);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("Output: "+new Q17TriangularNumSumTillN().triangularNumSumtillN(num));
	}
}

