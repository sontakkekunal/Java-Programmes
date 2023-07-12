import java.io.*;
class MyStringBufferSubString{
	static String myStringBufferSubString(StringBuffer sb,int start){
		StringBuffer sb1=new StringBuffer(sb);
		sb.delete(0,sb.length());
		for(int i=start;i<sb1.length();i++){
			sb.append(sb1.charAt(i));
		}
		return sb.toString();
	}
	static String myStringBufferSubString(StringBuffer sb,int start,int end){
                StringBuffer sb1=new StringBuffer(sb);
                sb.delete(0,sb.length());
                for(int i=start;i<end;i++){
                        sb.append(sb1.charAt(i));
                }
                return sb.toString();
        }

	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string buffer : ");
	        StringBuffer sb=new StringBuffer(br.readLine());
		System.out.println("Enter starting index to subString till end : ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Substring is : "+myStringBufferSubString(sb ,start));

		System.out.println("Enter string buffer : ");
                sb=new StringBuffer(br.readLine());
		System.out.println("Enter starting index to subString : ");
                start=Integer.parseInt(br.readLine());
		System.out.println("Enter ending index for substring : ");
		int end=Integer.parseInt(br.readLine());
                System.out.println("Substring is : "+myStringBufferSubString(sb ,start,end));
	}
}


