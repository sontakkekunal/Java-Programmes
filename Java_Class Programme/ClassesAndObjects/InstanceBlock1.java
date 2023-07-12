class InstanceBlock1{
	int x=10;
	static int y=20;
	InstanceBlock1(){
		System.out.println("In constructor");
	}
	static{
		System.out.println("In static block 1 ");
	}
	{
		System.out.println("In instance block 1");
	}
	public static void main(String [] args){
		InstanceBlock1 obj =new InstanceBlock1();
	}
	static {
		System.out.println("In static block 2");
	}
	{
		System.out.println("In Instance block 2");
	}
}
