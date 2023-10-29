/*
 Q. 12
Write a program to determine whether a given positive integer is a composite
number or not.
*/
import java.util.Scanner;
class Q12CompositeNum{
	int compo(int num,int n){
		if(n*n>num)
			return 0;
		int count=0;
		if(num%n==0){
			count++;
			if(num%((int)(num/n))==0 && n!=num/n)
					count++;
		}
		return count+compo(num,n+1);
	}
	boolean composite(int num){
		if(compo(num,1)>2)
			return true;
		else
			return false;
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("Ouput: "+new Q12CompositeNum().composite(num));
	}
}
