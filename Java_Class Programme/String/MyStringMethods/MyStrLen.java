import java.util.Scanner;
class MyLengthOfString{
    static int myLenStr(String str){
        int count=0;
        while(true){
            try{
               str.charAt(count);
               count++;
            }
            catch(StringIndexOutOfBoundsException e){
            break;
        }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string for finding length : ");
        String str=sc.nextLine();
        int len=myLenStr(str);
        System.out.println("Length of string is : "+len);
    }
}