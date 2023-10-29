/*
 Q. 13
Write a program to check if a given number is an Abundant Number or not.
(An Abundant number is the sum of all its proper divisors, denoted by sum(n), is
greater than the number's value.)
*/
import java.util.Scanner;
class Q13AbundantNum{
	int divisors(int num,int n){
		if(n*n>num)
			return 0;
		int sum=0;
		if(num%n==0){
			sum=sum+n;
			if(num%((int)(num/n))==0 && n!=num/n && num!=num/n)
				sum=sum+((int)(num/n));
		}
		return sum+divisors(num,n+1);
	}		
	boolean abundantNum(int num){
		if(divisors(num,1)>num)
			return true;
		else
			return false;
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("Ouput: "+new Q13AbundantNum().abundantNum(num));
	}
}
