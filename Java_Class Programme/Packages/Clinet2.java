import java.util.Scanner;
import Defff.SubstractionDefault;
class Client2{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers for substraction: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		SubstractionDefault obj = new SubstractionDefault(x,y);
		System.out.println(obj.sub());  //method sub() is default it is only accessable in its own dirtory
						//if method sub() is in other dirtory and we try to access it then error: sub() is not public in 
						//SubstractionDefault; cannot be accessed from outside package
	}
}
