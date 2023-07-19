import java.util.Scanner;
import java.lang.NullPointerException;
class Demo{
	public static void main(String [] atgs){
		Scanner sc = new Scanner(System.in);
		int x=0;
		System.out.println("Enter Data");
		try{
			x=sc.nextInt();
			System.out.println(10/x);
		}catch(NullPointerException obj1){          //We can sibling Exception in any catch  sequnce 
							    //But Parent Exception must be on after child Exception of catch 
			System.out.println("Exception-1");
		}catch(ArithmeticException obj2){
			System.out.println("Exception-2");
		}catch(Exception obj3){
			System.out.println("Exception-3");
		}
	}
}
