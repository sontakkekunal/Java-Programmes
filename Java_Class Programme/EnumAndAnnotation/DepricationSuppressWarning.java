//@Deprecated:- this anntation shows note to method code of Parent or  Child , after calling it from parent or child 
//so, at compile time it shows waring 
class Parent{
	@Deprecated
	void m1(){
		System.out.println("Parent -m1");
	}
}
//@SuppressWarning:- this hides that warning/note during compiling 
class Child{
//	@SuppressWarnings("Hello");   //it needs at least one String parameter in it
	public static void main(String [] args){
		Parent p= new Parent();
		p.m1();
	}
}
