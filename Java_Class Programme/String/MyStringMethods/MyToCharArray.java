import java.io.*;
class MyToCharArray{
	static char[] myToCharArray(String str){
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++){
			ch[i]=str.charAt(i);
		}
		return ch;
	}
	public static void main(String [] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String for covertiing it to array :  ");
        String str1=br.readLine();
	char ch[]=myToCharArray(str1);
	System.out.println("Array is :-");
	for(int i=0;i<ch.length;i++){
		System.out.print(ch[i]+" ");
	}
	}
}

