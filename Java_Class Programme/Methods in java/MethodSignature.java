class MethodSignature{
	int x=10;
	MethodSignature(){
		System.out.println("In conatuctor 1");
		System.out.println(" X = "+x);
	}
	//Java has methodSiganture which contain method table
	//method table stores method name & parameter list 
	//it checks for same contain , if found then error
	MethodSignature(){
		System.out.println("In conatuctor 2");
                System.out.println(" X = "+x);
	}
}
	
