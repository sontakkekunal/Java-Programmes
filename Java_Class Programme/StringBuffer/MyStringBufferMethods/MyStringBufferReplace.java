import java.io.*;
class MyStringBufferReplace{
	static StringBuffer myStringBufferReplace(StringBuffer sb,int start,int end,String str){
		StringBuffer sb1=new StringBuffer(sb);
		sb.delete(0,sb.length());
		boolean bool=true;
		for(int i=0;i<sb1.length();i++){
			if(i>=start && i<end){
			       if(bool){
			            sb.append(str);
				    bool=false;
				    continue;
		               }
	                       else{
		                 continue;
			       }
			}
                        sb.append(sb1.charAt(i));
                 }
                 return sb;
                 }		 
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string buffer : ");
	        StringBuffer sb1=new StringBuffer(br.readLine());
		System.out.println("Enter string to replace with 1st string Buffer : ");
                String str=br.readLine();
		System.out.println("Enter start index to replace : ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter end index to replace : ");
                int end=Integer.parseInt(br.readLine());
		sb1=myStringBufferReplace(sb1,start,end,str);
		System.out.println("After Replacing  : "+sb1);
	}
}

