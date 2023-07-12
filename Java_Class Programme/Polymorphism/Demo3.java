class Demo3{
	void fun(int x){
		System.out.println(x);
	}
	void fun(float y){
		System.out.println(y);
	}
	void fun(Demo3 obj){
		System.out.println("In Demo para ");
		System.out.println(obj);
	}
	public static void main(String [] args){
		Demo3 obj = new Demo3();
		obj.fun(10);
		obj.fun(10.5f);
		Demo3 obj1 = new Demo3();
		obj1.fun(obj);
	}
}
