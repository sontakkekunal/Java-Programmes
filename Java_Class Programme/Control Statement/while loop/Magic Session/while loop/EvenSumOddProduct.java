//Write a program to find the sum of all even number and mutilpication of odd number between user range.
import java.util.Scanner;
class EvenSumOddProduct{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number ");
		int N=input.nextInt();
		System.out.println("Enter second number ");
                int M=input.nextInt();
		int sum=0,product=1,tempM=0;
		if(N<=0 || M<=0){
			System.out.println("please enter positive number");
			main(null);
		}
		else if(M>N){
			int temp;
			temp=M;
			M=N;
			N=temp;
		}
		else if(M==N){
			System.out.println("Please enter two different number");
			main(null);
		}
		tempM=M;
		while(N>=tempM){
			if(tempM%2==0)
				sum=sum+tempM;
			else
				product=product*tempM;
			tempM++;
		}
		System.out.println("Sum of even digit between "+N+" and "+M+" is "+sum);
		System.out.println("Product of odd digit between "+N+" and "+M+" is "+product);
	}
}




