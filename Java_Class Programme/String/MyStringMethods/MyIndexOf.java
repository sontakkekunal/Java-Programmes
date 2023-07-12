import java.io.*;
class MYIndexOf{
	static int myIndexOf(String str,char ch,int num){
		for(int i=num;i<str.length();i++){
			if(str.charAt(i)==ch)
				return i;
		}
		return -1;
	}
	static int myIndexOf(String str,char ch){
                for(int i=0;i<str.length();i++){
                        if(str.charAt(i)==ch)
                                return i;
                }
                return -1;
        }
	static int myIndexOf(String str,String str2,int num){
                for(int i=num;i<str.length();i++){
                        if(str.charAt(i)==str2.charAt(0)){
				int temp=i;
				for(int j=0;j<str2.length();j++){
					if(str.charAt(temp)!=str2.charAt(j))
						break;
					if(j==str2.length()-1){
						return i;
					
					}
					temp++;
				}
			}
                }
                return -1;
        }
	static int myIndexOf(String str,String str2){
                for(int i=0;i<str.length();i++){
                        if(str.charAt(i)==str2.charAt(0)){
                                int temp=i;
                                for(int j=0;j<str2.length();j++){
                                        if(str.charAt(temp)!=str2.charAt(j))
                                                break;
                                        if(j==str2.length()-1 ){
                                                return i;
					}
                                        temp++;
                                }
                          }
		}
		return -1;
        }
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  string: ");
		String str=br.readLine();
		System.out.println("Enter character to indecate:  ");
		char ch=(char)br.read();
		br.skip(1);
		System.out.println("Enter index to start from : ");
		int num=Integer.parseInt(br.readLine());
		int value=myIndexOf(str,ch,num);
		System.out.println("Index found at : "+value);

		System.out.println("Enter  string: ");
                str=br.readLine();
		System.out.println("Enter character to indecate:  ");
                ch=(char)br.read();
		br.skip(1);
		System.out.println("Index found at : "+myIndexOf(str,ch));

		System.out.println("Enter  string: ");
                str=br.readLine();
		System.out.println("Enter string to search ");
		String str1=br.readLine();
		System.out.println("Index found at : "+myIndexOf(str,str1));

		System.out.println("Enter  string: ");
                str=br.readLine();
                System.out.println("Enter string to search ");
                str1=br.readLine();
		System.out.println("Enter index to start from : ");
                num=Integer.parseInt(br.readLine());
		System.out.println("Index found at : "+myIndexOf(str,str1,num));
	}
}

