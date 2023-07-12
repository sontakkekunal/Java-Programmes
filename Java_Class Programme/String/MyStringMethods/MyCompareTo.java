import java.io.*;
class MyCompareTo{
	static int myCompair(String str1,String str2){
		int mini;
		if(str1.length()>str2.length())
			mini=str2.length();
		else
			mini=str1.length();
		for(int i=0;i<mini;i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				int diff=(int)(str1.charAt(i)-str2.charAt(i));
				return diff;
			}
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
