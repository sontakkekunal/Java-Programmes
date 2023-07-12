class Parent{
	Parent(){
		System.out.println("In Constructor parent");
	}
	int x=10;
	static int y=20;
	void m1(){
		System.out.println("In Parent m1");
	}
	static void m2(){
		System.out.println("In Parent -m2");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Constructor Child");
	}
	int A=10;
	static int B=20;
	void m1(){
		System.out.println("In Child m1");
	}
	static void m3(){
		System.out.println("In Child m3");
	}
}
class Client{
	public static void main(String [] args){
		Parent obj1 = new Parent();
		obj1.m1();
		obj1.m2();
		Child obj2= new Child();
		obj2.m1();
		obj2.m2();
		Parent obj3= new Child();
		obj3.m1();
		obj3.m2();
	//	obj3.m3();  //<-- m3 not persent in Parent , so compile time error
	}
}
