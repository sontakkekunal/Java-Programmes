import java.io.*;
class MyConcateString{
    static char[] myConcat(String str1,String str2){
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        char arr3[]=new char[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int i=0;
        for(int j=arr1.length;j<arr3.length;j++){
            arr3[j]=arr2[i];
            i++;
        }
        return arr3;
    }
    public static void main(String [] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Concatenating the two String ");
        System.out.println("Enter 1st String ");
        String str1=br.readLine();
        System.out.println("Enter 2nd String ");
        String str2=br.readLine();
        String concated = new String(myConcat(str1,str2));
        System.out.println("Conatenated Stringis : "+concated);
    }
}