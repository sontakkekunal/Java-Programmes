import java.io.*;
class StringBufferDelete{
    static StringBuffer myStringBufferDelete(StringBuffer sb,int start,int end){
        StringBuffer newStringBuffer=new StringBuffer();
        for(int i=0;i<sb.length();i++){
            if(i>=start && i<end){
                continue;
            }
            newStringBuffer.append(sb.charAt(i));
        }
        return newStringBuffer;
    }
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
        System.out.println("Enter StringBuffer : ");
        StringBuffer sb1=new StringBuffer(br.readLine());
        System.out.println("Enter starting index of deleting : ");
        int start=Integer.parseInt(br.readLine());
        System.out.println("Enter ending index of deleting :");
        int end=Integer.parseInt(br.readLine());
        sb1=myStringBufferDelete(sb1,start,end);
        System.out.println("After Deletion StringBuffer is : "+sb1);
    }
        
}
