package protect;
public class MultiProtection{
	static int num1=0;
	static int num2=0;
	
	public MultiProtection(int num1,int num2){
		this.num1= num1;
		this.num2= num2;
	}
	public MultiProtection(){
	}
	static protected int multi(){//it is accessable in its same directory & its child class 
			      //for access it in child class we must pass requried paramter in parent constructor from child class
		//MultiProtection obj= new MultiProtection();
		return num1*num2;
	
	}
}

