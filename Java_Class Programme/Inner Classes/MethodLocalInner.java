class Outer{
	void m1(){
		System.out.println("In m1-Outer");
		class Inner{
			void m1(){
				System.out.println("In m1-inner");
			}
		}
		Inner obj = new Inner();
		obj.m1(); //<-- for acceing class in method we need to make object of that class in that same method
	}
	void m2(){
		System.out.println("In m2-Outer");
	}
	public static void main(String [] rah){
		Outer obj= new Outer();
		obj.m1();
		obj.m2();
	}
}
