interface Demo1{
	default void fun(){
		System.out.println("In fun-Demo1");
	}
}
interface Demo2{
	default void fun(){
		System.out.println("In fun-Demo2");
	}
}
class DemoChild implements Demo1,Demo2{
}
class Client{
	public static void main(String [] args){
		Demo obj =new DemoChild();
		obj.fun();
	}
}
