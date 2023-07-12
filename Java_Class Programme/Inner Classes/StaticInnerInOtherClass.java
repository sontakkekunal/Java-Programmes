class Outer{
	void m1(){
		System.out.println("In m1-Outer");
	}
	static class Inner{
		void m1(){
			System.out.println("In m1-Inner");
		}
	}
}
class Client{
	public static void main(String [] args){
		//Inner obj = new Inner(); //<-- error:cannot find symbol
		//Outer.Inner obj= new Inner();  //<--- error: cannot find symbol
		//Outer.Inner obj= new Outer().new Inner();  //<-- error: qualifed new of static class
		Outer.Inner obj = new Outer.Inner();
	}
}
