import java.util.Scanner;
class ReturnMethod1_5{
//	void fun(int x){   ----->error void type returns nothing , so we cannot print from in
	int fun(int x){
		int y=x+10;
		return y;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		ReturnMethod1_5 obj = new ReturnMethod1_5();
		System.out.println("Enter number for adding with 10 ");
		System.out.println(obj.fun(sc.nextInt()));
	}
}

