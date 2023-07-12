import java.io.*;
class MyCharAt{
	static char myCharAt(String str,int num){
		char arr[]=str.toCharArray();
		return arr[num];
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string : ");
		String str=br.readLine();
		System.out.println("Enter index : ");
		int index=Integer.parseInt(br.readLine());
		char ch=myCharAt(str,index);
		System.out.println("Character at index "+index+" in string is : "+ch);
	}
}
