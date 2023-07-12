//Given an integer N,Print sum of its digit. (Assume N>0)
import java.util.Scanner;
class DigitSum{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number N");
                int N=obj.nextInt();
		int Sum=0;
                //(N>0)
                //(N>=1)
                while(N!=0){
                        int temp=N%10;
			Sum=Sum+temp;
                        N=N/10;
                }
		System.out.println("Sum of digits is "+Sum);
        }
}

