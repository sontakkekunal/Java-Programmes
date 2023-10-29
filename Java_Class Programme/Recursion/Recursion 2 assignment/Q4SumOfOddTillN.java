//Q. 4
//Write a program to print the sum of odd numbers up to a given number.
import java.util.Scanner;
class Q4SumOfOddTillN{
	int sumOfOdd(int num){
		if(num==0)
			return 0;
		if(num%2==1)
			return num+sumOfOdd(num-1);
		else
			return sumOfOdd(num-1);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("OoutPut: "+new Q4SumOfOddTillN().sumOfOdd(num));
	}
}
