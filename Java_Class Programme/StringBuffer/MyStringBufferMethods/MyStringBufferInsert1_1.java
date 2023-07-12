import java.io.*;
class MyStringBufferinsert{
    static StringBuffer myStringBufferInsert(StringBuffer str1,StringBuffer str2, int position){
        StringBuffer temp=new StringBuffer(str1.length()+16);
        for(int i=0;i<str1.length();i++){
            temp.append(str1.charAt(i));
            if(i+1==position){
                temp.append(str2);
            }
        }
        return temp;
    }
    static StringBuffer myStringBufferInsert(StringBuffer str1,String str2, int position){
        StringBuffer temp=new StringBuffer(str1.length()+16);
        for(int i=0;i<str1.length();i++){
            temp.append(str1.charAt(i));
            if(i+1==position){
                temp.append(str2);
            }
        }
        return temp;
    }
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
        System.out.println("Enter StringBuffer : ");
        StringBuffer sb1=new StringBuffer(br.readLine());
        System.out.println("Enter String or StringBuffer to Insert : ");
        StringBuffer sb2=new StringBuffer(br.readLine());
       // String sb2=br.readLine();
        System.out.println("Enter positon at which to insert : ");
        int index=Integer.parseInt(br.readLine());
        sb1=myStringBufferInsert(sb1,sb2,index);
        System.out.println("After insertion StringBuffer is : "+sb1);
    }
}
        
