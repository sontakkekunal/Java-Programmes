import java.io.*;
class MyStringBufferAppend{
    static StringBuffer myStringBufferAppend(StringBuffer sb,StringBuffer str){
        String sttr=sb.toString()+str.toString();
        StringBuffer returnStringBuffer=new StringBuffer(sttr);
        return returnStringBuffer;
    }
    static StringBuffer myStringBufferAppend(StringBuffer sb,String str){
        String sttr=sb.toString()+str;
        StringBuffer returnStringBuffer=new StringBuffer(sttr);
        return returnStringBuffer;
    }
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
        System.out.println("Enter StringBuffer : ");
        StringBuffer sb=new StringBuffer(br.readLine());
        System.out.println("Enter StringBuffer or String to append :");
     // StringBuffer sb1=new StringBuffer(br.readLine());
        String sb1=br.readLine();
        sb=myStringBufferAppend(sb,sb1);
        System.out.println("After appending : "+sb);
        
     }
}
