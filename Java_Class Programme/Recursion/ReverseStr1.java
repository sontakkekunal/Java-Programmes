import java.util.Scanner;
class RevursionStr{
        String stringReverse(String str){
                if(str.length()<=1 || str==null ) 
                        return str;
                return stringReverse(str.substring(1))+str.charAt(0);
        }
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter string: ");
                String str=sc.nextLine();
                System.out.println("Reversed string is: "+new RevursionStr().stringReverse(str));
        }
}

