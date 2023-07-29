//public access specifier
import java.util.Scanner;
import arithfun.Addition;
class Client{
	public static void main(String [] arsg){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two number for addition ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Addition obj= new Addition(x,y);
		System.out.println(obj.add());
	}
}
		
