class Demo{
	void m1(){
		System.out.println(10/0);  //<--Exception occurs here,it check in this frame wheather Exception is handled or not,ifnot then jvm pop this
					   //<--frame and throws Exception to its caller i.e. main because main has called m1();
					   //<--further exution of this is interupted
		m2();
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String [] args){  //<-- after reeving Exception from the called frame i.e. m1(),it check in this frame wheather Exception
						  //<-- is handled or not,ifnot then jvm pop this and Exception is thrown to its caller i.e. to jvm 
						  //<-- and jvm handle is Exception by Default Exception handler
		Demo obj = new Demo();
		obj.m1();
	}
}
//Runtime Exception
//                     (Thread name)       (Exception name)       (Desribetion)
//O/p--> Exception in thread "main" java.lang.ArithmeticException: / by zero
	//at Demo.m1(ExceptionInFrame.java:3)        <-- Stack Trace
	//at Demo.main(ExceptionInFrame.java:15)     <-- Stack Trace

