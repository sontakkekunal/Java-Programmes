//Client need to give IP to server
//Serever fisrt sends requset to client
import java.net.*;
import java.io.*;
class Server{
	public static void main(String [] args)throws IOException{
						//port no passing in ServerSocket constructor
		ServerSocket ss=new ServerSocket(1200);
		Socket s =ss.accept();//server sending requset to client for connection
				      //it waits till client accept the server
		System.out.println("Connection Established");
		OutputStream os =s.getOutputStream();//getting pipeline for provding output to other
		PrintStream ps= new PrintStream(os);//stream for providing input in pipe
		ps.println("Hello Clinet");//passing message in pipe
		ps.println("go to hell");
		ss.close();
		ps.close();
		os.close();
	}
}
