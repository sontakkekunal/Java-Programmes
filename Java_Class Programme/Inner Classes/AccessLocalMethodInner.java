class Outer{
	Outer m1(){  //Object m1(){  <-- for error
		System.out.println("In m1-Outer");
		class Inner extends Outer{  //<-- class Inner{
			Inner m1(){  //<-- void m1(){
				System.out.println("In m1-Inner");
				return new Inner(); //
			}
		}
		return new Inner();
	}
}
class Client{
	public static void main(String [] args){
		Outer obj = new Outer();
		//Object obj1=obj.m1();  //<-- At compile time it obj1 has Object address so it at that 
		//obj1.m1();       //<--- it checks m1() method in Object , so it is not found , error
		//obj.m1().m1();  // <-- same reason
	        Outer obj1=obj.m1();
		obj1.m1();
	}
}
