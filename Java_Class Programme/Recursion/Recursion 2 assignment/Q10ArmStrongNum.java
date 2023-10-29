/*
 Q. 10
Write a program to check if a given number is an Armstrong number or not.
( An Armstrong number is a number that is equal to the sum of its own digits each
raised to the power of the number of digits.)
*/
import java.util.Scanner;
class Q10ArmStrongNum{
	int count=0;
	boolean flag=true;
	int numofDigit(int num){
		if(num==0)
			return 0;
		count++;
		numofDigit(num/10);
		return 0;
	}
	int mutiplesOfDigit(int num,int count){
		if(count==0)
			return 1;
		return num*mutiplesOfDigit(num,count-1);
	}
	int armStrong(int num){
		if(flag){
			numofDigit(num);
			flag=false;
		}
		if(num==0)
			return 0;
		return mutiplesOfDigit(num%10,count)+armStrong(num/10);
	}


	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
		if(num==new Q10ArmStrongNum().armStrong(num))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
