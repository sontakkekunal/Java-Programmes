class Ambiguity{
	void fun(int x,float y){
		System.out.println("Int-float para");
	}
	void fun(float x,int y){
		System.out.println("Float-Int para");
	}
}
class Client{
	public static void main(String [] args){
		Ambiguity obj = new Ambiguity();
		obj.fun(10,10);
	}
}
