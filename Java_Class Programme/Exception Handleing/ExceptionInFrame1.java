class Demo{
        void m2(){
                System.out.println("Start m2");
	        System.out.println(10/0); //<--Exception occurs here,it check in this frame wheather Exception is handled or not,ifnot then jvm pop this
                                          //<--frame and throws Exception to its caller i.e. m1() because m1() has called m2();
                System.out.println("End m2"); //<--further exution of this is interupted
               
        }
        void m1(){
                System.out.println("Start m1");
		m2();  //<-- after reeving Exception from the called frame i.e. m2(),it check in this frame wheather Exception is handled or not,if not 
		       //<-- then jvm pop this and Exception is thrown to its caller i.e. to main
		System.out.println("End m1"); //<--further exution of this is interupted
        }
        public static void main(String [] args){  //<-- after reeving Exception from the called frame i.e. m1(),it check in this frame wheather Exception
                                                  //<-- is handled or not,ifnot then jvm pop this and Exception is thrown to its caller i.e. to jvm 
                                                  //<-- and jvm handle is Exception by Default Exception handler
                System.out.println("End main");
	       	Demo obj = new Demo();
                obj.m1();
		System.out.println("Start main");
        }
}
//Runtime Exception
//o/p--> 
//End main
//Start m1
//Start m2
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Demo.m2(ExceptionInFrame1.java:4)
//	at Demo.m1(ExceptionInFrame1.java:11)
//	at Demo.main(ExceptionInFrame1.java:20)

