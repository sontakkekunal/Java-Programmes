import java.io.*;
class MyStringBufferLength{
	static int myStringBufferIndexOf(StringBuffer sb,String str2){
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==str2.charAt(0)){
				int temp=i;
				for(int j=0;j<str2.length();j++){
					if(sb.charAt(temp)!=str2.charAt(j))
						break;
					if(j==str2.length()-1 && sb.charAt(temp)==str2.charAt(j)){
						return i;
					}
					temp++;
				}
			}
		}
	        return -1;
	}
	static int myStringBufferIndexOf(StringBuffer sb,int start,String str2){
                for(int i=start;i<sb.length();i++){
                        if(sb.charAt(i)==str2.charAt(0)){
                                int temp=i;
                                for(int j=0;j<str2.length();j++){
                                        if(sb.charAt(temp)!=str2.charAt(j))
                                                break;
                                        if(j==str2.length()-1 && sb.charAt(temp)==str2.charAt(j)){
                                                return i;
                                        }
                                        temp++;
                                }
                        }
                }
                return -1;
        }

	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st  string buffer : ");
	        StringBuffer sb1=new StringBuffer(br.readLine());
		System.out.println("Enter 2nd  string for indexing in first stringbuffer : ");
                String str=br.readLine();
		System.out.println("String found at index :- "+myStringBufferIndexOf(sb1,str));

		System.out.println("Enter 1st  string buffer : ");
                sb1=new StringBuffer(br.readLine());
                System.out.println("Enter 2nd  string for indexing in first stringbuffer : ");
                str=br.readLine();
		System.out.println("Enter from which index you want to start : ");
		int start=Integer.parseInt(br.readLine());
                System.out.println("String found at index :- "+myStringBufferIndexOf(sb1,start,str));

	}
}




