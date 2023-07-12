class Method1_3{
//	void fun(int x){ ----->error:- required: int
	void fun(){
		System.out.println("In the fun method");
//		System.out.println(x);
		}
	static public void main(String [] hh){
		System.out.println("In the main method");
		Method1_3 obj = new Method1_3();
		obj.fun();  //---->found: no arguments
		System.out.println("The end");
		
	}
}

