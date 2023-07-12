import java.util.Scanner;
class ScannerInput{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String  here ");
                String str=sc.nextLine();
                System.out.println("Enter Intger here ");
                int num=sc.nextInt();
                System.out.println("Enter Character here ");
                char ch=sc.next().charAt(0);
                System.out.println("Enter float heree ");
                float num1=sc.nextFloat();
                System.out.println("Enter double here ");
                double num2=sc.nextDouble();

                System.out.println("String is "+str);
                System.out.println("Integer is "+num);
                System.out.println("Character is "+ch);
                System.out.println("Float is "+num1);
                System.out.println("Double is "+num2);
	}
}
