import java.util.Scanner;
class Decrement{
        public static void main(String [] args){
                Scanner obj=new Scanner(System.in);
                System.out.println("Enter number to decrement from:- ");
                int Dec=obj.nextInt();
		//similar condition for decrement in while
		//Dec>=0  , it will derment till o and print till 0
		//Dec!=0 ,it will decremrnt till 0 and will not print 0
		//!(Dec==0)  ,it will decremrnt till 0 and will not print 0
		while(Dec>=0){
			System.out.println(Dec);
			Dec--;
		}
	}
}

