//Write a program which takes no. from user if the no. is even then print no.in reverse or if no. is odd print by decreing two till zero.
import java.util.Scanner;
class EvenOddCondition{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for conditon ");
		int N=input.nextInt();
		if(N<=0){
			System.out.println("plaese enter positive number ");
			N=0;
			main(null);
		}
		else if(N%2==0){
			System.out.println("Reverse order from "+N+" is ");
			while(N>0){
				System.out.println(N);
				N--;
			}
		}
		else{
			
			System.out.println("Decrement by two from "+N+" till zero is ");
			while(N>0){
				System.out.println(N);
				N=N-2;
			}
		}
	}
}

