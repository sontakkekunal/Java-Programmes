import java.io.*;
import java.lang.NumberFormatException;
class ExeptionDemo{
	public static void main(String [] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data ");
		String str=br.readLine();  //<- here anything entered is considered as String , so less Exception changes
		System.out.println(str);
		System.out.println("Enter data ");
		int data=0;
		try{
			data =Integer.parseInt(br.readLine());  //String to integer can create Exception due to charcter entering
		}catch(NumberFormatException obj){
			System.out.println("Please Enter integer data ");  //Can use nested try catch in catch block or recurson of that perticular 
									   //stack frame by calling it again in catch
			data=Integer.parseInt(br.readLine());
		}
		System.out.println(data);
	}
}
