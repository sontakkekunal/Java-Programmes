class Method1_2{
	int x=10;
	static int y=15;
	void fun(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}
	public static void main(String [] args){
		Method1_2 obj = new Method1_2();
		obj.fun();
	}
}


