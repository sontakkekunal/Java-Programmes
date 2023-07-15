class Demo{
	public static void main(String [] args)throws ArithmeticException{//Even thown adding throws ArithmeticException to header of main, it throws 
									  //Exception to jvm i.e. same as origin without adding throws ArithmeticExcepti
									  //on.It does not handle the Exception here, and further exceution is interupted 
		System.out.println("Start main");//<--Excuted
		System.out.println(10/0); //<-- Exception occers here
		System.out.println("End main"); //<--not excuted due exception occuring
	}
}
//O/P->
//Start main
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Demo.main(ThrowsEffectOnRTE.java:4)

