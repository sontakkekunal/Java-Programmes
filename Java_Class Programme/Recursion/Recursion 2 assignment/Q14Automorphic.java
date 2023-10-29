/*
 Q14.
Write a Java program to determine whether a given positive integer is an
automorphic number or not.
(An automorphic number (also known as a circular number) is a number whose
square ends with the same digits as the number itself)
*/
import java.util.Scanner;
class Q14Automorphic{
	long digitCount(long num){
		if(num==0)
			return 0;
		return 1+digitCount(num/10);
	}
	long zeros(long num){
		if(num==0)
			return 1;
		return 10*zeros(num/10);
	}
	long reverse(long num,long n,long zeros){
		if(n==0)
			return 0;
		long sum=((num%10)*(zeros));
		return sum+reverse(num/10,n-1,zeros/10);
	}
	boolean automorphic(int num){
		long digitCount=digitCount(num);
		//System.out.println("DigitC: "+digitCount);
		long numSqr=num*num;
		//System.out.println("numSqr: "+numSqr);
		long zeroS=zeros(num/10);
		//System.out.println("zer: "+zeroS);
		long num1=reverse(numSqr,digitCount,zeroS);
		//System.out.println("n1: "+num1);
		num1=reverse(num1,digitCount,zeroS);
		//System.out.println("n2: "+num1);
		if(num==num1)
			return true;
		else
			return false;
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("Ouput: "+new Q14Automorphic().automorphic(num));
	}
}
