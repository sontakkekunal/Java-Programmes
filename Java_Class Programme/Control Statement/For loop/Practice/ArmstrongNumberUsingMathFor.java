//Armstrong no. for all digit number using for loop and math
import java.util.Scanner;
import java.lang.Math;
class ArmstrongNumberUsingMathFor{
        public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  number  for checking it is armstrong or not ");
                int N=input.nextInt();
		int count=0;
		int temp=N;
		int temp1=N;
		double sum=0;
		//(  ;temp!=0;temp=temp/10)
		//(  ;temp>=1;temp=temp/10)
		for(  ;temp>0;temp=temp/10){
			count++;
		}
		//(  ;temp1!=0;temp1=temp1/10)
		//(  ;temp1>=1;temp1=temp1/10)
		for(  ;temp1!=0;temp1=temp1/10){
			int value=temp1%10;
			double product=Math.pow(value,count);
			sum=sum+product;
		}
		if(sum==N)
			System.out.println(N+" is a armstrong Number");
		else
			System.out.println(N+" is not armstrong Number");
	}
}
