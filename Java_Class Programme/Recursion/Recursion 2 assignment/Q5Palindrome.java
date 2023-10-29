/*
 Q. 5
Write a program to check whether the given number is a palindrome number or
not.
*/
import java.util.Scanner;
class Q5Palindrome{
	boolean flag=true;
	int num2=0;
	int num1=0;
	boolean palindrome(int num){
		if(flag){
			num1=num;
			flag=false;
		}
		if(num==0){
			if(num1==num2)
				return true;
			else
				return false;
		}
		num2=num2*10+(num%10);
		return palindrome(num/10);
	}
			

	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("OoutPut: "+new Q5Palindrome().palindrome(num));
	}
}
