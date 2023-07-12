import java.io.*;
class MyStringBufferLength{
	static int myStringBufferLength(StringBuffer sb){
		char ch[]=sb.toString().toCharArray();
		return ch.length;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  string buffer : ");
		StringBuffer sb1=new StringBuffer(br.readLine());
		System.out.println("Length of String buffer is : "+myStringBufferLength(sb1));
	}
}

