import java.util.Scanner;
class Vote{
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your age :- ");
		int age=obj.nextInt();
		if(age>=18)
			System.out.println("You are eligible for voting");
		else
			System.out.println("you are under 18 , you are not eligible for voting");
	}
}
