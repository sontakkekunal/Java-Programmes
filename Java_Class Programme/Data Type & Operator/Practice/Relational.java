import java.util.Scanner;
class Relational{
	public static void main(String [] args){
		int x,y;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter x and y ");
		x=obj.nextInt();
		y=obj.nextInt();
		System.out.println("x<y ");
		System.out.println(x<y);
		System.out.println("x>y ");
		System.out.println(x>y);
		System.out.println("x<=y ");
		System.out.println(x<=y);
		System.out.println("x>=y ");
		System.out.println(x>=y);
		System.out.println("x==y ");
		System.out.println(x==y);
		System.out.println("x!=y ");
		System.out.println(x!=y);
	}
}
