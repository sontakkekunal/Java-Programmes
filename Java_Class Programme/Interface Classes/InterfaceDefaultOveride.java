interface Demo{
	void gun();
	default void fun(){
		System.out.println("In gun-Demo");
	}
}
class DemoChild implements Demo{
	public  void fun(){
		System.out.println("In fun-DemoChild");
	}
	public void gun(){
		System.out.println("In gun-Demochild");
	}
}
class Client{
	public static void main(String [] args){
		Demo obj =new DemoChild();
		obj.fun();
		obj.gun();
	}
}
