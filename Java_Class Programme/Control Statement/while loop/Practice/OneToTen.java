import java.util.Scanner;
class OneToTen{
	public static void main(String [] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number to start:- ");
		int Start=obj.nextInt();
		System.out.println("Enter number to end:- ");
                int End=obj.nextInt();
		int temp=Start;
		while(Start<=End){
			System.out.println("The number between "+(temp-1)+" to "+(End+1)+" is "+Start);
			Start++;
		}
	}
}
