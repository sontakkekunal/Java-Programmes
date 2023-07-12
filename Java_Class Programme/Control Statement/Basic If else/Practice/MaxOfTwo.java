import java.util.Scanner;
class MaxOfTwo{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
		System.out.println("Enter two number ");
		float num1=obj.nextFloat();
		float num2=obj.nextFloat();
		if(num1>num2)
			System.out.println(num1+" is greater number");
		else{
			if(num2>num1)
				System.out.println(num2+" is greater number");
			else
				System.out.println(num1+" and "+num2+" are same number");
		}
	

	}
}

