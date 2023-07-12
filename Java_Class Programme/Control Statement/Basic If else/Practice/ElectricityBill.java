import java.util.Scanner;
class ElectricityBill{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number of unit  ");
                float num1=obj.nextFloat();
		if(num1<100)
			System.out.println("For unit below 100  ,it cost 1 rupree for each unit \n So Electricity Bill is "+ num1);
		else{
			num1=num1-100;
			num1=(num1*2)+100;
			System.out.println("For unit above 100  ,it cost 2 rupree for each unit \n So Electricity Bill is "+ num1);
		}
	}
}


