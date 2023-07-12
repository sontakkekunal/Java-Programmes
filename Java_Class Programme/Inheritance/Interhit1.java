class Parent{
	Parent(){
		System.out.println("In parent Constructor");
	}
	void parentProperty(){
		System.out.println("FLat,Car,Gold");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In child Constructor");
	}
}
class Client{
	public static void main(String [] args){
		Child obj= new Child();
		obj.parentProperty();
	}
}
