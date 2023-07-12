class Singleton{
	static Singleton obj= new Singleton();
	private Singleton(){
		System.out.println("Constructor");
	}
	void name(){
		System.out.println("Kunal");
	}
	int x=10;
	static Singleton getObject(){
		return obj;
	}
}
class Client{
	public static void main(String [] args){
		Singleton obj1= Singleton.getObject();
		System.out.println(obj1);
		obj1.name();

		Singleton obj2 =Singleton.getObject();
		System.out.println(obj2);
		System.out.println(obj2.x);
	}
}
