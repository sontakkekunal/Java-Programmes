class ObjectPassInheritance{
	void fun(String str){
		System.out.println("String");
	}
	void fun(StringBuffer str){
		System.out.println("StringBuffer"+" "+str);
	}
}
class Client{
	public static void main(String [] aj){
		ObjectPassInheritance obj= new ObjectPassInheritance();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer("c2w"));
		obj.fun(new String("hi"));
		//obj.fun(null);   <----- 'null' matches in both method parameter , so ambigous error
	}
}

