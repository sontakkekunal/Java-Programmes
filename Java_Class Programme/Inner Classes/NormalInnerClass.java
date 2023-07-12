class Outer{
	class Inner{
		void m1(){
			Outer this$0=new Outer();
			System.out.println("In m1-Inner  "+this$0);
		}
	}
	void m2(){
		System.out.println("In m2-outer");
	}
}
class Client{
	public static void main(String [] args){
		Outer obj = new Outer();
		obj.m2();

		//Outer.Inner obj1 = obj.new Inner();
		Outer.Inner obj1 = new Outer().new Inner();   //<--- more benefical , saving storage cost
	        obj1.m1();
	}
}
