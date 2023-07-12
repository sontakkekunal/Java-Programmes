class ReturnMethod1_3{
//	void fun(int x){       --------> error: incompatible types: void cannot be converted to int
        int fun(int x){
		int  y=x+10;
		return y;
	}
	public static void main(String [] rah){
		ReturnMethod1_3 obj = new ReturnMethod1_3();
		int a=obj.fun(10);
		System.out.println(a);
	}
}
