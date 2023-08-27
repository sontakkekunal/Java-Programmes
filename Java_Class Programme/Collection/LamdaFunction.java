//lambda function expression work only on functional interface
//lambda function is launched at java 1.8
//Functional interface:- the interface that have only one method
interface Core2Web{
	void lang();
}
//lamdbda expression is used to create instances of funstional interface (method referance or constructor refernce)
//new annmyous inner class is not created here,beacsuse pushing byte code of class is heavy operation
class Year2022{
	public static void main(String [] args){
		Core2Web c2w=()->{////based on the parameter list it matches lambda function

			System.out.println("bootcamp/Java/python/c");
		};
		c2w.lang();
	}
}
