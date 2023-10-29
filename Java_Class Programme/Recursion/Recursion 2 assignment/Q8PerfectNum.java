/*
 Q. 8
Write a program to check whether a given positive integer is a Perfect Number or
not.
(A Perfect Number is a positive integer that is equal to the sum of its proper
divisors, excluding itself.)
*/
import java.util.Scanner;
class Q8PerfectNum{
	int i=1;
	int perfectNum(int num){
		if(i*i>=num)
			return 0;
		int sum=0;
		if(num%i==0){
			sum=sum+i;
			if((num/i)!=num)
				sum=sum+(num/i);
		}
		i++;
		return sum+perfectNum(num);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
		if(num==new Q8PerfectNum().perfectNum(num))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
