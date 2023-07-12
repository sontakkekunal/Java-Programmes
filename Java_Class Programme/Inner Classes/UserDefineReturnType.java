class Demo{
	Demo(){
		System.out.println("In Constructor Demo");
	}
}
class DemoChild extends Demo{
	DemoChild(){
		System.out.println("In constructor DemoChild");
	}
}
class Parent{
	Parent(){
		System.out.println("In parent constructor");
	}
	Demo m1(){
		System.out.println("i am m1-parent");
		return new Demo();
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Constructor- child");
	}
	DemoChild m1(){
		System.out.println("In m1-child");
		return new DemoChild();
	}
}
class Client{
	public static void main(String [] args){
		Parent obj= new Child();
		obj.m1();
	}
}
