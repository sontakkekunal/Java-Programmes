abstract class Parent{
	void carrer(){
		System.out.println("Doctor");
	}
	abstract void marry();
}
class Client{
	public static void main(String [] args){
		Parent obj=new Parent();  //<--- Abstract class cannot be instantiated i.e. we cannot make object of abstract class
	}
}
