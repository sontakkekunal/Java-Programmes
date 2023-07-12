class Outer{
	void fun(){
		System.out.println("In fun");
	}
	class Inner{
		void name(){
         		this$0.fun();
		}
	}

}
class Client{
	public static void main(String [] args){
		Outer.Inner obj = new Outer().new Inner();
		obj.name();
	}
}
