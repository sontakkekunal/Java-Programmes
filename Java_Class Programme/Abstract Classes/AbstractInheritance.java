abstract class Parent{
	void carrer(){
		System.out.println("Doctor");
	}
	abstract void marry();
}
class  Child extends Parent{
	void marry(){
		System.out.println("Dream girl");
	}
}
class Client{
	public static void main(String [] args){
		Child obj = new Child();
		obj.carrer();
		obj.marry();
	}
}

		

