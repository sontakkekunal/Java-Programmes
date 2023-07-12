import java.util.Scanner;
class MethodOper{
	static void add(int x,int y){
		int ans=x+y;
		System.out.println(ans);
	}
	static void sub(int a, int b){
		float ans=a-b;
		System.out.println(ans);
	}
        void mult(int c,int m){
		double ans=c*m;
		System.out.println(ans);
	}
	void div(int a , int b){
		float ans=a/b;
		System.out.println(ans);
	}
	
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a and b");
		int a=sc.nextInt();
		int b=Integer.parseInt(sc.next());
		MethodOper obj= new MethodOper();
		add(a,b);
		sub(a,b);
		obj.mult(a,b);
		obj.div(a,b);
	}
}
