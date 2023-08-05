import java.io.*;
//package myStringMethods;
class MyReplace{
	static String myReplace(String str,char ch1,char ch2){
		char arr[]=str.toCharArray();
		String value="";
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ch1)
				arr[i]=ch2;
			value=value+arr[i];
		}
		return value;
	}
	static String myReplace(String str,String str1,String str2){
                String value="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==str1.charAt(0)){
				int temp=i;
				for(int j=0;j<str1.length();j++){
					if(str.charAt(temp)!=str1.charAt(j))
						break;
					if(j==str1.length()-1){
						value=value+str2;
						i=str1.length()+i;
					}
					temp++;
				}
			}
			if(i>=str.length())
				continue;
			value=value+str.charAt(i);
		}
		return value;
        }
	
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  string: ");
		String str=br.readLine();
		System.out.println("Enter old character to replace:  ");
		char ch1=(char)br.read();
		br.skip(1);
		System.out.println("Enter new  character to replace :  ");
                char ch2=(char)br.read();
                br.skip(1);
		String value=myReplace(str,ch1,ch2);
		System.out.println("String after replacing is : "+value);

		System.out.println("Enter  string: ");
                str=br.readLine();
		System.out.println("Enter old string to replace : ");
		String str1=br.readLine();
		System.out.println("Enter new string to replace : ");
		String str2=br.readLine();
		System.out.println("String after replacing is : "+myReplace(str,str1,str2));


	}
	
}
