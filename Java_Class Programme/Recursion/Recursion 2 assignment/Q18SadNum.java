/*
 Q18.
Write a program to determine whether a given positive integer is a sad number or
not.
*/
import java.util.Scanner;
class Q18SadNum{
	int sumOfSqr(int num){
		if(num==0)
			return 0;
		return ((num%10)*(num%10))+sumOfSqr(num/10);
	}
	int sadNum(int num){
		if(num<10 && num>-10)
			return num;
		return sadNum(sumOfSqr(num));
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
		int test =new Q18SadNum().sadNum(num);
		//System.out.println(test);
		if(1!=test)
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
