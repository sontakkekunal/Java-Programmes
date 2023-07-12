import java.io.*;
class MyStringBufferLastIndexOf{
	static int myStringBufferIndexOf(StringBuffer sb,String str2){
		for(int i=sb.length()-1;i>=0;i--){
			if(sb.charAt(i)==str2.charAt(str2.length()-1)){
				int temp=i;
				for(int j=str2.length()-1;j>=0;j--){
					if(sb.charAt(temp)!=str2.charAt(j))
						break;
					if(j==0  && sb.charAt(temp)==str2.charAt(j)){
						return temp;
					}
					temp--;
				}
			}
		}
	        return -1;
	}
	static int myStringBufferIndexOf(StringBuffer sb,int last,String str2){
                for(int i=last;i>=0;i--){
                        if(sb.charAt(i)==str2.charAt(str2.length()-1)){
                                int temp=i;
                                for(int j=str2.length()-1;j>=0;j--){
                                        if(sb.charAt(temp)!=str2.charAt(j))
                                                break;
                                        if(j==0  && sb.charAt(temp)==str2.charAt(j)){
                                                return temp;
                                        }
                                        temp--;
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
		System.out.println("Enter from which last index to reverse : ");
		int last=Integer.parseInt(br.readLine());
                System.out.println("String found at index :- "+myStringBufferIndexOf(sb1,last,str));
	}
}

