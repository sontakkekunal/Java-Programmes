import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//OR import java.io.*;
class BufferedReader1_1{
	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String  here ");
		String str=br.readLine();
		System.out.println("Enter Intger here ");
		int num=Integer.parseInt(br.readLine());
		System.out.println("Enter Character here ");
		char ch=(char)br.read();
		br.skip(1);
		System.out.println("Enter float heree ");
		float num1=Float.parseFloat(br.readLine());
		System.out.println("Enter double here ");
		double num2=Double.parseDouble(br.readLine());

		System.out.println("String is "+str);
		System.out.println("Integer is "+num);
		System.out.println("Character is "+ch);
		System.out.println("Float is "+num1);
		System.out.println("Double is "+num2);
	}
}
		
