/*
 Q20.
Write a program to determine whether a given positive integer is a Deficient
Number or not. A Deficient Number is a positive integer where the sum of its
proper divisors is less than the number itself.
*/
import java.util.Scanner;
class Q20Deficient{
	long factorsSum(long i,long num){
		if(i*i>=num)
			return 0;
		long sum=0;
		if(num%i==0){
			sum=sum+i;
			if(num%((int)num/i)==0 && num!=(num/i) && i!=(num/i))
				sum=sum+((int)num/i);
		}
		i++;
		return sum+factorsSum(i,num);
	}
	boolean deficient(long num){
		if(factorsSum(1,num)<num)
			return true;
		else
			return false;
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("Output: "+new Q20Deficient().deficient(num));
	}
}
