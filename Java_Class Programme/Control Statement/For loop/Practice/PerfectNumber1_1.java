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
		int sum=0;
		for(int i=1;i<N;i++){
			if(N%i==0)
				sum=sum+i;
		}
		if(N==sum){
			System.out.println(N+" is a perfect number");
			}
		else
			System.out.println(N+" is not a perfect number");
	}
}

	

