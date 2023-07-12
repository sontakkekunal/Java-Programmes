import java.util.*;
import java.io.*;
class Spliter{
    public static void main(String [] args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        char ser='A';
	System.out.println("Enter string for spliting it with ( )(,)(/)(-)(_)");
        System.out.println("Enter a string:- ");
        String str=br.readLine();
        if(str.contains(" ")){ser=' ';}
        else if(str.contains(",")){ser=',';}
        else if(str.contains("/")){ser='/';}
        else if(str.contains("-")){ser='-';}
        else if(str.contains("_")){ser='_';}
        else{System.out.println("Please enter any symbol for spliting the string");
        System.exit(0);}
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ser){
            count++;
        }
        }
        String value=""+ser;
        String arr[]=new String[count+1];
        StringTokenizer obj = new StringTokenizer(str,value);
        for(int i=0;i<=count;i++){
            arr[i]=obj.nextToken();
        }
        for(int i=0;i<=count;i++){
            System.out.println((i+1)+" word is "+arr[i]);
        }       
        
    }
}
