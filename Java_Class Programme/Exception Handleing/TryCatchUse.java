class Demo{
	public static void main(String [] arfs){
		System.out.println("Strat main");
		try{  //<- throws new ArithmeticException(object) to catch block parameter 
			System.out.println(10/0);  //Risk code
		}catch(ArithmeticException obj){  //Special method //ArithmeticException obj = new ArithmeticException()
			System.out.println("Exception occred");  //Handled code
		}  //Catch block is stored in Exception Table
		System.out.println("End main");  
	}
}

