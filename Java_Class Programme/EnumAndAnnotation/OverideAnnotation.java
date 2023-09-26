//annotation present in java.lang.annotation.Annotation
//Override annotation is writen in childs method of override
//thid giving extra information to compiler that which method is going tp override
//it also helps to developer to understands better overiding
//all annotation are interfaces
class Parent{
	void m1(){
		System.out.println("parent-m1");
	}
}
class Child extends Parent{
	@Override    //to tell compiler this method is been override
	void m1(int x){
		System.out.println("Child -m1");
	}
}
//o/p:> error: method does not override or implement a method from a supertype

