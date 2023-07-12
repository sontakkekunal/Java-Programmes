import java.io.*;
class MyStringBufferReveres{
	static StringBuffer sb1;
	static StringBuffer myStringBufferReverse(StringBuffer sb){
		sb=new StringBuffer(sb1);
		sb1.delete(0,sb1.length());
		for(int i=sb.length()-1;i>=0;i--){
			sb1.append(sb.charAt(i));
		}
		return sb1;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  string buffer : ");
	        sb1=new StringBuffer(br.readLine());
		myStringBufferReverse(sb1);
		System.out.println("Reversed string is : "+sb1);
	}
}


