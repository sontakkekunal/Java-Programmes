import java.util.Scanner;
class Bitwise{
	public static void main(String [] args){
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter x and y");
		int x=obj.nextInt();
		int y=obj.nextInt();

		System.out.println("x & y is "+ (x & y));
		System.out.println("x | y is "+ (x | y));
		System.out.println("x ^ y is "+ (x ^ y));
		System.out.println("Right shift of  x >>3 is "+ (x>>3));
		System.out.println("Right shift of y >>3 is "+ (y>>3));
		System.out.println("Left shift of x <<3 is "+ (x<<3));
		System.out.println("Left shift of y <<3 is "+ (y<<3));
		System.out.println("Zeroth Right shift of X>>>3 is "+ (x>>>3));


	}
}
