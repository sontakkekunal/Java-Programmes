//throw is generally used for User define Exception
import java.util.Scanner;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		int x=sc.nextInt();
		try{
			if(x==0)
				throw new ArithmeticException("Divide by zero"); // throwing exception 
		System.out.println(10/x);
		}catch(ArithmeticException ae){ //thrown Exception is catched here             
			System.out.print("Exception in thread "+Thread.currentThread().getName()+" ");//|--this methodChaneing will return name of thread
			ae.printStackTrace();  // <-- prints stack trace
			ae.getMessage();  // <-- prints only message
		}
	}
}

