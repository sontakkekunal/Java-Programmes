import java.lang.*;
class ParameterInParentChild{
	void fun(Object obj){
		System.out.println("Object");
	}
	void fun(String str){
		System.out.println("String");
	}
	/*
	void fun(StringBuffer str){
		System.out.println("InStringBuffer");
	}*/
}
class Client{
	public static void main(String [] s){
		ParameterInParentChild obj = new ParameterInParentChild();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer());
		obj.fun(null);
	}
}
