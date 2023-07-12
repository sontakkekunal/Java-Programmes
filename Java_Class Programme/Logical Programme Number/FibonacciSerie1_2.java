//In fibonacci series ,next number is the sum of previous two number 
//e.g.:-0,1,1,2,3,5,8,13,21,34,55,...
//The first two number of fibonacci series are 0 and 1.
//Write fibonacci series uptill N number.
import java.util.Scanner;
class FibonacciSeries{
        public static void main(String [] nj){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter number for printing fibonacci series  uptil that number ");
                int Num=obj.nextInt();
		int num1=0;
		int num2=1;
		System.out.print(num1+" , "+num2);  // printing 0 and 1
		int result;
//		while(Num>=3){
		while(Num>2){
			result=num1+num2;
			num1=num2;
			num2=result;
			System.out.print(" ,"+result+" ");
			Num--;
		}
	}
}

