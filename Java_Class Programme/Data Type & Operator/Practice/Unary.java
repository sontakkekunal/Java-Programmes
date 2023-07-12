import java.util.Scanner;
class Unary{
	public static void main(String [] args){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter x and y = ");
		int x=num.nextInt();
		int y=num.nextInt();

		System.out.println("Preincremrnt of x is "+(++x));
		System.out.println("Preincremrnt of y is "+(++y));

		System.out.println("Predecremrnt of x is "+(--x));
		System.out.println("Predecremrnt of x is "+(--y));

		System.out.println("Now x is "+(x));
		System.out.println("Now y is "+(y));

		System.out.println("Postincremrnt of x is "+(x++));
		System.out.println("Postincremrnt of y is "+(y++));

		System.out.println("Now x is "+(x));
                System.out.println("Now y is "+(y));

		System.out.println("Postdecrement  of x is "+(x--));
		System.out.println("Postdecrement  of y is "+(y--));

		System.out.println("Now x is "+(x));
                System.out.println("Now y is "+(y));

		int ans1= ++x + x++;
		int ans2 = --y + y++;

		System.out.println("Answer of (++x + x++) is "+ans1);
		System.out.println("Answer of (--y + y++) is "+ans2);

		System.out.println("Now x is "+(x));
                System.out.println("Now y is "+(y));

		int ans= ++x + y++ + x++;
		System.out.println("Answer of (++x + y++ + x++) is "+ans);
		System.out.println("Now x is "+(x));
                System.out.println("Now y is "+(y));

	}
}
