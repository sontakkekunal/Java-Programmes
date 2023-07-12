import java.util.Scanner;
class Logical{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter x and y");
		int x=obj.nextInt();
		int y=obj.nextInt();

		boolean ans1= x<=y && y<=x;
		boolean ans2= x<y || y>x;

		System.out.println("Answer of x<=y && y<=x is "+ ans1);
		System.out.println("Answer of x<y || y>x is "+ans2);
	}
}
