//Take int n as input .Print weather N is perfect number or not
//Input:-4, outpur:- not a perfect number
//Input:-6, output:- perfect number
//defintion :- Addition of factor esacept that given number is equal to given number then it is perfect number
import java.util.Scanner;
class PerfectNumber{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for checking perfect number or not ");
		int N=input.nextInt();
		//( ;temp>=1;temp--)
		int sum=0;
		int temp=N;
		for( ;temp>0;temp--){
			if(N%temp==0){
				if(temp!=N)
					sum=sum+temp;
			}
		}
		if(N==sum){
			System.out.println(N+" is a perfect number");
			}
		else
			System.out.println(N+" is not a perfect number");
	}
}
