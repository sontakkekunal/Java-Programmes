class Parent{
	static{
		System.out.println("In Parent Static Block");
	}
}
class Child extends Parent{
	static{
		System.out.println("In child static block");
	}
}
class StaticInheritance{
	public static void main(String [] arhs){
		Child obj = new Child();
	}
}
