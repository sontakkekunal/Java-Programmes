class Parent{
	Parent(){
		System.out.println("In parent constructor");
	}
	void property(){
		System.out.println("Something");
	}
	void marry(){
		System.out.println("Parent choosen girl");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In child Constuctor");
	}
	void marry(){
		System.out.println("I choosen girl");
	}
}
class Clinet{
	public static void main(String [] args){
		Child obj= new Child();
		obj.property();
		obj.marry();
	}
}

