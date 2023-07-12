class Parent{
	//Static does not participate in overding 
	static void fun(){
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("In Child fun");
	}
}

