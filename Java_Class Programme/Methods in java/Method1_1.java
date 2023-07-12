
class Method1_1{
	static int x=10;
	int y=15;
	void fun(){
		System.out.println("In the fun method");
		System.out.println(x+y);

	}
	static void gun(){
		System.out.println("In the gun method");
	}
	public static void main(String [] args){
		Method1_1 obj = new Method1_1();
		gun();
		obj.fun();
		System.out.println(x);
		System.out.println(obj.y);
		System.out.println(x+obj.y);
	}
}
