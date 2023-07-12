import java.io.*;
class MyConatString{
    static char[] myConcat(String str1,String str2){
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        char arr3[]=new char[arr1.length+arr2.length];
        int j=0;
        for(int i=0;i<arr3.length;i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }
            else{
                arr3[i]=arr2[j];
                j++;
            }
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