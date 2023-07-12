import java.io.*;
class MyStringBufferDelete{
	static StringBuffer sb1;
	static StringBuffer myStringBufferDelete(StringBuffer sb,int start,int end){
		sb=new StringBuffer(sb1);
		sb1.setLength(0);
		for(int i=0;i<sb.length();i++){
			if(i>=start && i<end)
				continue;
			sb1.append(sb.charAt(i));
		}
		return sb1;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  string buffer : ");
	        sb1=new StringBuffer(br.readLine());
		System.out.println("Enter start index for deletion : ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter end  index for deletion : ");
		int end=Integer.parseInt(br.readLine());
		myStringBufferDelete(sb1,start,end);
		System.out.println("After deletion StringBuffer is : "+sb1);
	}
}
