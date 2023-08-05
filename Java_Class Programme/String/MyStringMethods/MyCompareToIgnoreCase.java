import java.io.*;
//package myStringMethods;
class MyCompareToIgnoreCase{
	static int myCompair(String str1,String str2){
		int mini;
		if(str1.length()>str2.length())
			mini=str2.length();
		else
			mini=str1.length();
		
		for(int i=0;i<mini;i++){
			int diff=(int)(str1.charAt(i)-str2.charAt(i));
			if(diff==-32 || diff==32 || diff==0)
				continue;
			str1=""+str1.charAt(i);
			str2=""+str2.charAt(i);
			str1=str1.toUpperCase();
			str2=str2.toUpperCase();
			diff=(int)(str1.charAt(0)-str2.charAt(0));
			return diff;
		}
		return str1.length()-str2.length();
	}
	
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string: ");
		String str1=br.readLine();
		System.out.println("Enter second string: ");
                String str2=br.readLine();
		int compair=myCompair(str1,str2);
		System.out.println("Differnce is : "+compair);
	}
	
}
