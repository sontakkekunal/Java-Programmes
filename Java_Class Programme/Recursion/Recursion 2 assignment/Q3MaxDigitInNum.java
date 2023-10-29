//Q. 3
//Write a program to print the maximum digit in a given number.
import java.util.Scanner;
class Q3MaxDigitInNum{
	int maxDigitInNum(int num){
		if(num==0)
			return Integer.MIN_VALUE;
		int max=maxDigitInNum(num/10);
		if(max<(num%10))
			max=num%10;
		return max;
	}
	 public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("OoutPut: "+new Q3MaxDigitInNum().maxDigitInNum(num));
	 }
}

