class Method1_4{
	public static void main(String [] args){
		System.out.println("In the main method");
		Method1_4 obj= new Method1_4();
		obj.fun(10);
//		obj.fun(10.5f);    ------->error : incompitable type:Possible lossy convertion from float to int .    // required: int  . found:float
	}
	void fun(int x){
		System.out.println("In the fun method");
		System.out.println(x);
	}
}

