class StaticBlock3{
	int x=10;
	static int y=20;
	static{
		System.out.println("Static block 1");
	}
	public static void main(String [] args){
		System.out.println("Main method");
		StaticBlock3 obj =new StaticBlock3();
		System.out.println(obj.x);
	}
	static{
		System.out.println("Static block 2");
		System.out.println(y);
	}
}
