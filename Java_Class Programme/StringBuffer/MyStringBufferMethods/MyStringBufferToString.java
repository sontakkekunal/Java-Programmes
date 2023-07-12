import java.io.*;
class MyStringBufferToString{
	static String myStringBufferToString(StringBuffer sb){
		String str="";
		for(int i=0;i<sb.length();i++){
			str=str+sb.charAt(i);
		}
		return str;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  string buffer : ");
	        StringBuffer sb1=new StringBuffer(br.readLine());
		String str=myStringBufferToString(sb1);
		System.out.println("String is : "+str);
	}
}

