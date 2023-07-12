import java.io.*;
class MyEqualIngoreCase{
	static boolean myEqualsIngoreCase(String str1,String str2){
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
				int diff =str1.charAt(i)-str2.charAt(i);
				if(diff==-32 || diff==32 || diff==0)
					continue;
				else
					return false;
		        }
		          return true;
         	}
		else{
			return false;
		}
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string: ");
		String str1=br.readLine();
		System.out.println("Enter second string: ");
                String str2=br.readLine();
		boolean value= myEqualsIngoreCase(str1,str2);
		System.out.println("Both string are same : "+value);
	}
}
