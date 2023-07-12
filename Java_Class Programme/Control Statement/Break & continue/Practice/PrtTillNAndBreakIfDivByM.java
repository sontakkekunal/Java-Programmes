//Write program to print till N and break if is divisible by M
import java.util.Scanner;
class PrtTillNAndBreakIfDivByM{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive  number for till there ");
		int N=input.nextInt();
		System.out.println("Enter  number check diviblelity and breaking loop ");
                int M=input.nextInt();
		if(N<0){
			System.out.println("Negative number "+N+" is converted to postive "+(-N));
			N=-N;
		}
		else if(N==0){
			System.out.println(" please enter postive ,\n Zero is not postive ");
			main(null);
		}
		for(int i=1;i<=N;i++){
			if(i%M==0){
				System.out.println(i+" is divisble by "+M+" \n Hence loop breaked according to condition");
				break;
			}
			System.out.println(i);
		}
	}
}


		


