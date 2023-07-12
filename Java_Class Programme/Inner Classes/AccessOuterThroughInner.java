class Outer{
	int x=10;
	static int y=20;
	class Inner{
		void fun2(){
			System.out.println("Fun 2- Inner");
			System.out.println(x);
			System.out.println(y);
			fun1();
		}  //we can access outer class method & variable of outer class from Inner class 
	}
	void fun1(){
		System.out.println("Fun1- Outer");
	}
}
