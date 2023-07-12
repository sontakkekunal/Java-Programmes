class Parent{
	final void fun(){  //<-- final method cannot be overide
		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("Child fun");
	}
}

