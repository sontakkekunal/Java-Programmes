import java.util.Scanner;
class InSufficentMoneyException extends RuntimeException{
	InSufficentMoneyException(String msg){
		super(msg);
	}
}
class ServerDownException extends RuntimeException{
	ServerDownException(String msg){
		super(msg);
	}
}
class Payment{
	public static void main(String [] args){
		int amount=1000;
		int server=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter payements amount");
		int pay=sc.nextInt();
		if(pay>amount)
			throw new InSufficentMoneyException("Insuffient Balance");
		if(server==0)
			throw new ServerDownException("Server Down");
		System.out.println("Payment Sucessfull");
	}
}

