interface Methods{
	void m1();
	void m2();
	void m3();
}
//here, in AdapativeDesignInherface the interface is implemented on abstract class
//that abtract class gives empty body to necessary method which are been used further
//this abstract class is called as Adapative class
//due to this the dependence of giving body class finishes by normal concerte class like ClientA,ClientB,etc..
//the abstract class is extended by the normal concrete class
//which method normal class want to use is overided by that specific class from abstract class
//so Adapative class work like a adapter between interface and concreted class
abstract class AbstractChild implements Methods{
	public void m1(){
	}
	public void m2(){
	}
	public void m3(){
	}
}
class ClientA extends AbstractChild{
	public void m1(){
		System.out.println("In m1");
	}
}
class ClientB extends AbstractChild{
	public void m2(){
		System.out.println("In m2");
	}
}
class Client{
	public static void main(String [] args){
		ClientA obj1= new ClientA();
		obj1.m1();
		ClientB obj2= new ClientB();
		obj2.m2();
	}
}
