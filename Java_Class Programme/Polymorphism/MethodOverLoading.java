class MethodOverRiding{
	void fun(int x){
		System.out.println(x);
	}
	void fun(float y){
		System.out.println(y);
	}
	void fun(MethodOverRiding obj){
		System.out.println("In MethodOverRiding parra");
		System.out.println(obj);
	}
	public static void main(String [] args){
		MethodOverRiding obj = new MethodOverRiding();
		obj.fun(10);
		obj.fun(10.5f);
		MethodOverRiding obj1=new MethodOverRiding();
		obj1.fun(obj);
	}
}
