///Q. 2
//Write a program to print the product of digits of a given number.
import java.util.Scanner;
class Q2ProductOfDigit{
        int productOfDigit(int num){
                if(num==0)
                        return 1;
                return (num%10)*productOfDigit(num/10);
        }
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter num: ");
                int num=sc.nextInt();
                System.out.println("OoutPut: "+new Q2ProductOfDigit().productOfDigit(num));
        }
}

