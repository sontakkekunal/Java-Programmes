class Demo3{
	int x=10;
	private int y=20;
	static int z=30;
	void disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Client3{
	public static void main(String [] args){
		Demo3 obj1=new Demo3();
		Demo3 obj2=new Demo3();
		obj1.disp();

		obj1.x=100;
		obj2.z=300;
		obj1.disp();
		obj2.disp();
	}
}
