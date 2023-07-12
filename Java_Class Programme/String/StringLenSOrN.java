import java.io.*;
class StringLengthSOrN{
    static int myStrLen(String str){
        char arr[]=str.toCharArray();
        return arr.length;
    }
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
        System.out.println("Enter first string : ");
        String str1=br.readLine();
        System.out.println("Enter second string : ");
        String str2=br.readLine();
        if(myStrLen(str1)==myStrLen(str2)){
            System.out.println("Str1 and str2 have same length");
        }
        else{
            System.out.println("str1 and str2 have different length");
        }
    }
}