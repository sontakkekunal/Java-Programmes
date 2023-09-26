import java.io.*;
import java.net.*;
class Client{
	public static void main(String [] args)throws IOException{
		Socket s= new Socket("Localhost",1200);//accepting request of perticular port
		InputStream is=s.getInputStream();//getting input pipeline of that port
		BufferedReader br= new BufferedReader(new InputStreamReader(is));//Reading input form pipe
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
		s.close();
	}
}

