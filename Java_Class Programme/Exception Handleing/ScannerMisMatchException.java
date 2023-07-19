import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
class Demo{
        public static void main(String [] atgs){
                Scanner sc = new Scanner(System.in);
                int x=0;
                System.out.println("Enter Data");
                try{
                        x=sc.nextInt();
		}
		catch(InputMismatchException obj){
			System.out.println("Exception handled manully");
		}
		catch(NoSuchElementException obj1){
			System.out.println("Exception handled manully");
		}
		System.out.println("x is : "+x);
		
	}
}

