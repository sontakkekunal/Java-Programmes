import java.util.Scanner;
import protect.MultiProtection;
class Clinet3 extends MultiProtection{
	Clinet3(){
		super();
	}
		
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two number for multiplcation : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		MultiProtection obj = new MultiProtection(x,y);
		System.out.println(MultiProtection.multi());
	}
}
