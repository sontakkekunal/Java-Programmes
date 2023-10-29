/*
 Q19.
Write a program to determine whether a given number is square number or not.
*/
import java.util.Scanner;
class Q10SqrNum{
	boolean sqrRoot(long num1,long num2,long num){
		if(num1>num2)
			return false;
		long mid=(num1+num2)/2;
		long sqr=mid*mid;
		//System.out.println(num1+ "  "+num2+"   "+mid);
		if(sqr==num)
			return true;
		if(sqr>num)
			num2=mid-1;
		if(sqr<num)
			num1=mid+1;
		return sqrRoot(num1,num2,num);
	}
	boolean sqrNum(int num){
		return sqrRoot(1,num,num);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
		System.out.println("Output: "+new Q10SqrNum().sqrNum(num));
	}
}
