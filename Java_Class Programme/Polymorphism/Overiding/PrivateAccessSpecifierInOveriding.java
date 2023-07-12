class Parent{
	private void fun(){ //<--- private method is only limited to that class , it is not inherited to child
			    // private method is not visibile in byte code
		System.out.println("Parent fun");
	}
}
class Child extends Parent{  
	void fun(){ //<-- new method of Child class
		System.out.println("Child fun");
	}
}

