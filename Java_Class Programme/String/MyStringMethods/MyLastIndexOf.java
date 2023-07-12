import java.io.*;
class LastIndexOf{
	static int myLastIndexOf(String str,String str1 ){
                for(int i=str.length()-1;i>=0;i--){
                        if(str.charAt(i)==str1.charAt(str1.length()-1)){
				int temp=i;
				for(int j=str1.length()-1;j>=0;j--){
					if(str.charAt(temp)!=str1.charAt(j))
						break;
					if(j==0)
						return temp;
					temp--;
				}
                        }
                }
                return -1;
        }
	static int myLastIndexOf(String str,int num,String str1 ){
                for(int i=num;i>=0;i--){
                        if(str.charAt(i)==str1.charAt(str1.length()-1)){
                                int temp=i;
                                for(int j=str1.length()-1;j>=0;j--){
                                        if(str.charAt(temp)!=str1.charAt(j))
                                                break;
                                        if(j==0)
                                                return temp;
                                        temp--;
                                }
                        }
                }
                return -1;
        }
	static int myLastIndexOf(String str,char ch ,int num){
		for(int i=num;i>=0;i--){
			if(str.charAt(i)==ch){
				return i;
			}
		}
		return -1;
	}
	static int myLastIndexOf(String str,char ch ){
                for(int i=str.length()-1;i>=0;i--){
                        if(str.charAt(i)==ch){
                                return i;
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
		System.out.println("Enter index to reverse start from : ");
		int num=Integer.parseInt(br.readLine());
		int value=myLastIndexOf(str,ch,num);
		System.out.println("character "+ch+" found from reverse start from "+num+" at : "+value);

		System.out.println("Enter  string: ");
                str=br.readLine();
                System.out.println("Enter character to indecate:  ");
                ch=(char)br.read();
                br.skip(1);
		System.out.println("character "+ch+" found from reverse at : "+myLastIndexOf(str,ch));

		System.out.println("Enter  string: ");
                str=br.readLine();
                System.out.println("Enter string to search from reevrse : ");
		String str1=br.readLine();
		System.out.println("String is found from reverse at : "+myLastIndexOf(str,str1));

		System.out.println("Enter  string: ");
                str=br.readLine();
                System.out.println("Enter string to search from reevrse : ");
                str1=br.readLine();
		System.out.println("Enter index to reverse start from : ");
                num=Integer.parseInt(br.readLine());
                System.out.println("String is found from reverse at : "+myLastIndexOf(str,num,str1));

	}
}
