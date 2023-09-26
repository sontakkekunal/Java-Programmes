import java.io.*;
import java.net.*;
class User1{
	public static void main(String [] args)throws IOException{
		ServerSocket ss= new ServerSocket(1200);
		System.out.println("Waiting for connection ");
		Socket s1= ss.accept();
		System.out.println("Connection Establihed at address "+s1.getLocalAddress()+" at port "+s1.getPort());
		OutputStream os = s1.getOutputStream();
		PrintStream ps = new PrintStream(os);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Socket s2= new Socket("localHost",1225);
		InputStream is =s2.getInputStream();
		BufferedReader br1= new BufferedReader(new InputStreamReader(is));
		String str1="";
		String str="";
		while(!str.equals("ks.close")){
			System.out.println("Enter message and click enter: ");
			str=br.readLine();
			ps.println(str);
			System.out.println("Waiting for responce");
			str1=br1.readLine();
			System.out.println("User2: "+str1);
			if(str1.equals("ks.close")){
				System.out.println("Connection closed by user2");
				break;
			}
		}
		System.out.println("Connection closed");
	}
}

