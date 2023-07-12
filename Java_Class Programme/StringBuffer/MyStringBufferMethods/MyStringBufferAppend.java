import java.io.*;
class MyStringBufferAppend{
	static StringBuffer sb1;
	static StringBuffer myStringBufferAppend(StringBuffer sb,StringBuffer sb2){
		sb1=new StringBuffer(sb1.toString()+sb2.toString());
		return sb1;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st string buffer : ");
	        sb1=new StringBuffer(br.readLine());
		System.out.println("Enter 2nd string buffer to append with 1st stringbuffer : ");
                StringBuffer sb2=new StringBuffer(br.readLine());
		myStringBufferAppend(sb1,sb2);
		System.out.println("Appended StringBuffer is : "+sb1);
	}
}

