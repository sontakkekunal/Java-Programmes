import java.io.*;
import java.net.*;
class User2{
        public static void main(String [] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Socket s2= new Socket("localHost",1200);
                InputStream is =s2.getInputStream();
                BufferedReader br1= new BufferedReader(new InputStreamReader(is));
//		System.out.println("Request of address  is accepted at port "+s2.getPort());
//		System.out.println("Do you want to continue(yes/no): ");
//		String dec=br.readLine();
//		if(dec=="no")
//			System.exit(0);

		ServerSocket ss= new ServerSocket(1225);
		System.out.println("Waiting for connection");
                Socket s1= ss.accept();
                System.out.println("Connection Establihed to address "+s1.getRemoteSocketAddress()+" is accepted at port "+s1.getPort());
                OutputStream os = s1.getOutputStream();
                PrintStream ps = new PrintStream(os);

                String str1=null;
                String str="";
                while(!str.equals("ks.close")){
			System.out.println("Waiting for responsec");
			str1=br1.readLine();
                        System.out.println("User1: "+str1);
			if(str1.equals("ks.close")){
                                System.out.println("Connection closed by user1");
                                break;
                        }
                        System.out.println("Enter message and click enter: ");
                        str=br.readLine();
                        ps.println(str);

                }
		System.out.println("Connection closed");
        }
}

