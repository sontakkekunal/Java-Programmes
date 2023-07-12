
import java.io.*;
import java.util.*;
class StringToken{
	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Bike owner first name,first letter of state ,number-plate number,Bike price in lakh in only one line");
		String bike=br.readLine();
		StringTokenizer tok=new StringTokenizer(bike," ");
		String token1=tok.nextToken();
		char token2=(tok.nextToken()).charAt(0);
		int token3=Integer.parseInt(tok.nextToken());
		float token4=Float.parseFloat(tok.nextToken());
		System.out.println("Owner name is "+token1);
		System.out.println("State is "+token2);
		System.out.println("Number plate is "+token3);
		System.out.println("Bike price is "+token4);
	}
}



