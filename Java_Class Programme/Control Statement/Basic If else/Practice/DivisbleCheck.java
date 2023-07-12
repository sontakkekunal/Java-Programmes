import java.util.Scanner;
class DivisbleCheck{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number for divible ");
		float numerator=obj.nextFloat();
		System.out.println("Enter a number for divinding to "+numerator);
		float denomnator=obj.nextFloat();
		if(numerator%denomnator==0)
			System.out.println(numerator+" is divisble by "+denomnator);
		else
			System.out.println(numerator+" is not divisble by "+denomnator);
	}
}

