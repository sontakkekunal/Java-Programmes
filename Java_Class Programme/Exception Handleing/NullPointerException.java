class Demo{
        void m1(){
                System.out.println("In m1");
	}
        void m2(){
                System.out.println("In m2");
        }
        public static void main(String [] args){
                Demo obj = new Demo();
                obj.m1(); //<-- Excetion occurs occurs , obj has addrees of Object Demo
		obj=null; //<-- obj has pointed to null i.e. no adddess
		obj.m2(); //<-- Exception occurs here ,beause obj don't have any address
        }
}
//Runtime Exception
//O/p-->
//In m1
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Demo.m2()" because "<local1>" is null
//	at Demo.main(NullPointerException.java:12)

