class Demo{
	public static void main(String[] args){
		byte var1=20;
		byte var2=30;
		System.out.println("First variable "+var1);
	        System.out.println("Second  variable "+var2);
		//This will rise error :- incompatible type: possible lossy coversion from int to byte
	        //var1=var1+var2;
		//System.out.println("Sum is "+(var1));
		//the newly generated value for var1 is integer
		//byte data type has size of 2 byte and int has size of 4 byte, so it can not convert size of large data type to small data type,because data may get loose
		
		//Solution:-
		System.out.println("Sum is "+(var1+var2));
		//OR
		int sum=var1+var2;
		System.out.println("Sum is  "+sum);
	}
}

