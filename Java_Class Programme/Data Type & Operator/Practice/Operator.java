import java.util.Scanner;
class Operator{
	public static void main(String [] srgs){
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter first number = ");
		int x=obj.nextInt();
		System.out.println("Enter second  number = ");
		int y=obj.nextInt();
		System.out.println("Addition of number is "+(x+y));
		System.out.println("Substraction of number is "+(x-y));
		System.out.println("Multipication of number is "+(x*y));
		System.out.println("Divison of number is "+(x/y));
		System.out.println("Remainder of divison of number is "+(x%y));
	}
}
