import java.io.*;
//package myStringMethods;
class MySubString{
	static String mySubString(String str,int n1){
		String value="";
		for(int i=n1;i<str.length();i++){
			value=value+str.charAt(i);
		}
		return value;
	}
	static String mySubString(String str,int n1,int n2){
                String value="";
                for(int i=n1;i<n2;i++){
                        value=value+str.charAt(i);
                }
                return value;
        }
	
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  string: ");
		String str=br.readLine();
		System.out.println("Enter index where string is cut is start  : ");
		int n1=Integer.parseInt(br.readLine());
		System.out.println("Enter index to end at that string : ");
		int n2=Integer.parseInt(br.readLine());
		System.out.println("Sub String form "+n1+" to till end is : "+mySubString(str,n1));
	        System.out.println("Sub String form "+n1+" to "+n2+" is : "+mySubString(str,n1,n2));
	}
	
}

