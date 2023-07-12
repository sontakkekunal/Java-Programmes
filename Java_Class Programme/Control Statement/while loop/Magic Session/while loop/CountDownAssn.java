//Write a progarm to print the countdown to submit the assignment
import java.util.Scanner;
class CountDownAssn{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day to sumbit assngment ");
		int N=input.nextInt();
		if(N<=0){
			System.out.println("plaese enter positive number ");
			N=0;
			main(null);
		}
		while(N!=0){
			System.out.println(N+" days remaining");
			N--;
		}
		System.out.println("0 day assignment is overdue");
	}
}

