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
		for(int i=Num;i>2;i--){
//              for(int i=0;i<(Num-1);i++){
//		for(int i=1;i<=(Num-2);i++){   //-2 , because we have printed 0 and 1 prevoiusly and fibnocai start from 0 and 1
			result=num1+num2;
			num1=num2;
			num2=result;
			System.out.print(", "+result+" ");
		}
	}
}


