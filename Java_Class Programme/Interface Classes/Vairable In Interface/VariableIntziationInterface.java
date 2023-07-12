interface Demo{
	int x=10;
	void fun();
}
class DemoChild implements Demo{
	public void fun(){
		System.out.println(x);  //<-- x is instizised here , in this stack frame ,each time 'x' is called
		System.out.println(Demo.x); //<-- same there
	}
}
class Client{
	public static void main(String [] args){
		Demo obj = new DemoChild();
		obj.fun();
	}
}

