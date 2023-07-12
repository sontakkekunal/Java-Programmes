import java.io.*;
class StringBufferReverse{
    static StringBuffer myStringBufferReverse(StringBuffer sb){
        StringBuffer sb1=new StringBuffer(sb.length()+16);
        for(int i=sb.length()-1;i>=0;i--){
            sb1.append(sb.charAt(i));
        }
        return sb1;
    }
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
        System.out.println("Enter StringBuffer : ");
        StringBuffer sb1=new StringBuffer(br.readLine());
        sb1=myStringBufferReverse(sb1);
        System.out.println("After Reversing : "+sb1);
    }
}