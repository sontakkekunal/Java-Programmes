import java.util.Scanner;
class OddEven{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number for checking even or odd");
		double num=obj.nextDouble();
		if(num%2==0)
			System.out.println(num+" is a even number");
		else
			System.out.println(num+" is a odd number");
	}
}

