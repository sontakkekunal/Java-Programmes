class Demo{
	public static void main(String [] args){

		//Declaration of float values
		//this will rise error:- possible lossy conversion from double to float
		//Even we have given float data type ,the 3.5 is consider as double value and convertion from double to float is not possible,double has size of 8 byte and float has size of 4 byte
		//float f1=3.5;
		//float f2=3.5;

		//Solution:-
		//write 'f' at ending of float value
		float f1=3.5f;
		float f2=3.5f;
		System.out.println("First value is "+f1);
		System.out.println("Second value is "+f2);
		System.out.println("Sum is "+(f1+f2));
	}
}

