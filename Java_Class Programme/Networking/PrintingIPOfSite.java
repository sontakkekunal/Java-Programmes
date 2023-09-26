import java.io.*;
import java.net.*;
class PrintingIPOfSite{
	public static void main(String [] args)throws IOException{//here both UnknownHostException and IOException is throws because
								  //IOException is parent of UnknownHostException
								  //so throwing parent exception  throws child exception as well
		System.out.println("Enter site for its IP: ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();//throws IOException
		InetAddress ip= InetAddress.getByName(str);  //internally throws UnknownHostException Exception,beacuse site presnet
							     //or not 
		System.out.println("Ip is : "+ip);
	}
}

