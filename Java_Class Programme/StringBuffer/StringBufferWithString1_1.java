class StringBufferWithString1_1{
    public static void main(String[] args){
        String str1 ="Shashi";
        String str2 =new String("Bagal");
        StringBuffer str3 =new StringBuffer("Core2Web");
        
 /*      String str4=str1.concat(str3);  error---》 incompatible type stringbuffer cannot be converted to string. */
 
 
        String str4= str1.concat(str2);
        StringBuffer str5= str3.append(str2);
        
        System.out.println("str1 is : "+str1);
        System.out.println("str2 is : "+str2);
        System.out.println("str3 is : "+str3);
        System.out.println("str4 is : "+str4);
        System.out.println("str5 is : "+str5);
    }
}