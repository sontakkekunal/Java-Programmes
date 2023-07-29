//public access specfier
package arithfun;//creates the dirtory or folder or package in the current dirtory and putts compiled file(.class) of this java file in that dirtory
		 //i.e. arithfun , after compilation
public class Addition{
	int num1=0;
	int num2=0;
  	public Addition(int num1,int num2){ //constructor is default if we have not specified ,here if public is not written so Addition constructor is
					    //default And default is not accessable outside the dirtoray,it gives error
					    // error: Addition(int,int) is not public in Addition; cannot be accessed from outside package
		this.num1=num1;
		this.num2=num2;
	}
	public int add(){
		return num1+num2;
	}
}

