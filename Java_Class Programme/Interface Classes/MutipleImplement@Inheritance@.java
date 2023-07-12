interface Demo1{
	void fun();
}
interface Demo2{
	void fun();
}
class DemoChild implements Demo1,Demo2{
	public void fun(){
		System.out.println("In fun Child");
	}
	//In both inhertance they have same method with same method Signature , but they are abstract , so no abiguity in child of both interface
	//we can give body to inheritanted method
}
class Client{
	public static void main(String [] args){
		Demo1 obj1=new DemoChild();
		obj1.fun();

		Demo2 obj2= new DemoChild();
		obj2.fun();
	}
}
