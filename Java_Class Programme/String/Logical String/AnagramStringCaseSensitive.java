import java.io.*;
class AnagramString{
	boolean checkAnagramStrings(String str1,String str2){
		if(str1.length()!=str2.length())
			return false;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		int len=ch1.length;
		for(int i=0;i<len;i++){
			int count1=0;
			int count2=0;
			for(int j=0;j<len;j++){
				if(ch1[i]==ch1[j])
					count1++;
			}
			for(int k=0;k<len;k++){
				if(ch1[i]==ch2[k])
					count2++;
			}
			if(count1!=count2)
				return false;
		}
		return true;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Strings for checking it is Anagram string or not : ");
		System.out.println("Enter first string : ");
		String str1=br.readLine();
		System.out.println("Enter second string : ");
                String str2=br.readLine();
		AnagramString obj= new AnagramString();
		if(obj.checkAnagramStrings(str1,str2))
			System.out.println(str1+" and "+str2+" are anagram string ");
		else
			System.out.println(str1+" and "+str2+" are not anagram string ");
	}
}

