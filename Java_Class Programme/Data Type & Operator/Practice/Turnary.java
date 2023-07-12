import java.util.Scanner;

class Turnary{
       static String y_max=" is smaller than ";
	public static void main(String [] args){
		Turnary mj= new Turnary();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter x and y ");
		int x=obj.nextInt();
		int y=obj.nextInt();
		String value=(y>x)?(x+y_max+y):("Both x and y are equal");
		String x_max=" is greater than ";
		System.out.println((x>y)?(x+x_max+y):(value));
        }
}
