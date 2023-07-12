import java.util.Scanner;
class DivisibleByTwoNo{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number for divible ");
		float num1=obj.nextFloat();
		System.out.println("Enter two number for dividing to "+num1);
		float num2=obj.nextFloat();
		float num3=obj.nextFloat();

		if(num1%num2==0 && num1%num3==0)
			System.out.println(num1+" is divislbe by both "+num2+" and "+num3);
		else if(num1%num2==0)
			System.out.println(num1+" is only divisble by "+num2);
		else if(num1%num3==0)
			System.out.println(num1+" is only divisble by "+num3);
		else
			System.out.println(num1+" is not divisble by "+num2+" or "+num3);
	}
}

