import java.io.*;
class InputInStringBuffer{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter StringBuffer : ");
		StringBuffer sb=new StringBuffer(br.readLine());
		System.out.println(sb);
	}
}
