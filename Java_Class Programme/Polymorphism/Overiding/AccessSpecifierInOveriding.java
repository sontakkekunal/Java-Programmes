class Parent{
	public void fun(){
		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	void fun(){	//<--- Default access specfier
			//Deceaseing the scope of method will give error
             System.out.println("Child fun");
	}
}
