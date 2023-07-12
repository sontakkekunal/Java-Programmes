class Method1_5{
	public static void main(String [] args){
		Method1_5 obj = new Method1_5();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('a');
//		obj.fun(true);    ------>error : incompitable type:boolean cannot convertion to float .    // required: float  . found:boolean   *Boolean is only compatible with boolean data*
	}
	void fun(float x){
		System.out.println("in the fun method");
		System.out.println(x);
	}
}
