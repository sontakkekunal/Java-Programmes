/*
 Q. 6
Write a program to check whether a given number is a Strong Number or not.
*/
import java.util.Scanner;
class Q6StrongNumber{
	int factorial(int num){
		if(num==0)
			return 1;
		return num*factorial(num-1);
	}
	int strongNum(int num){
		if(num==0)
			return 0;
		int sum=factorial(num%10);
		return sum+strongNum(num/10);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                if(num==new Q6StrongNumber().strongNum(num))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}

			
