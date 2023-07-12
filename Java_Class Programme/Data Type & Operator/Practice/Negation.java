import java.util.Scanner;
class Negation{
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number for neagtion ");
		int x=obj.nextInt();
		System.out.println("Negation of number is"+ (~x));

	}
}

