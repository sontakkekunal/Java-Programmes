class StackOverFlow{
	static void fun(int x){           //Less stack frame is pushed compare to native langusge like c++
					  //we cannot handle error by try catch
		System.out.println(x);
		fun(++x);
	}
	public static void main(String [] arhs){
		fun(1);
	}
}
//O/p-->
//Exception in thread "main" java.lang.StackOverflowError
//	at StackOverFlow.fun(StackOverFlow.java:3)
//	at StackOverFlow.fun(StackOverFlow.java:3)
//
//	StackOverflowError
//	 |
//	VirtualMachineError
//	 |
//	Error
//	 |
//	Throwable


