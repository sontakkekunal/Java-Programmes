/*
 Q16.
Write a program that determines whether a given number is a cube number or not.

(A cube number is defined as a number that is the cube of an integer.)
*/
import java.util.Scanner;
class Q16CubeNum{
	boolean cubeRoot(long num1,long num2,long num){
		if(num1>num2){
			//System.out.println(num1);
			//System.out.println(num2);
			return false;
		}
		long mid=(num1+num2)/2;
		long val=mid*mid*mid;
		//System.out.println(num1 +"  "+num2+" "+num);
		if(val==num)
			return true;
		if(val>num)
			num2=mid-1;
		if(val<num)
			num1=mid+1;
		return cubeRoot(num1,num2,num);

	}
	boolean cubeNum(int num){
		return cubeRoot(1,num,num);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number: ");
                int num=sc.nextInt();
                System.out.println("Output: "+new Q16CubeNum().cubeNum(num));
	}
}

