/*
 Q. 9
Write a program to determine whether a given number is a happy number or not.

(A happy number is a number which eventually reaches 1 when replaced by the
sum of the square of each digit.)
*/
import java.util.Scanner;
class Q9HappyNum{
	int sumOfSqr(int num){
		if(num==0)
			return 0;
		return ((num%10)*(num%10))+sumOfSqr(num/10);
	}
	int happyNum(int num){
		if(num<10 && num>-10)
			return num;
		return happyNum(sumOfSqr(num));
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
		int test =new Q9HappyNum().happyNum(num);
		//System.out.println(test);
		if(1==test)
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
