import java.util.Scanner;
class Temperature{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
		System.out.println("Enter the temperture in Ferianide ");
		double temp=obj.nextDouble();
		if(temp>98.6)
			System.out.println("Temperature is high");
		else if(temp>=98.0)
			System.out.println("Temperature is normal");
		else
			System.out.println("temperature is low");
	}
}


