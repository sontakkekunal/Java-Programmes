import java.io.*;
class HasMethod{
	void method(String str){
		System.out.println("Your string is :- "+str);
	}
}
class Object1{
	static HasMethod obj=new HasMethod();
}
class Demo4{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any String ");
		String str = br.readLine();
		Object1.obj.method(str);
		}
}



