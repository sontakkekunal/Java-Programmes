class StaticDemo1{
	static int x=10;
	static{
		System.out.println("static block");
		System.out.println(x);
		int y=50;
		System.out.println(y);
	}
//	static int z=y;
	public static void main(String [] args){
		System.out.println("main method");
		System.out.println(StaticDemo1.x);
	}
}
