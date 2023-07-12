import java.io.*;
class MyStringBufferInsert{
	static StringBuffer sb1;
	static StringBuffer myStringBufferInsert(StringBuffer sb,StringBuffer sb2,int position){
		sb=new StringBuffer(sb);
		sb1.delete(0,sb1.length());
		for(int i=0;i<sb.length();i++){
			sb1.append(sb.charAt(i));
			if(i+1==position)
				sb1.append(sb2);
		}
		return sb1;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st string buffer : ");
	        sb1=new StringBuffer(br.readLine());
//		System.out.println("--> "+System.identityHashCode(sb1));
		System.out.println("Enter 2nd string buffer to insert in  1st stringbuffer : ");
                StringBuffer sb2=new StringBuffer(br.readLine());
		System.out.println("Enter position at which to insert 2nd string : ");
		int position=Integer.parseInt(br.readLine());
		myStringBufferInsert(sb1,sb2,position);
		System.out.println("After insertion stringBuffer is : "+sb1);
//		System.out.println("--> "+System.identityHashCode(sb1));

	}
}

