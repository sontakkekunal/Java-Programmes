class StringBufferWithString1_2{
    public static void main(String[] args){
        String str1 ="Shashi";
        String str2 =new String("Bagal");
        StringBuffer str3 =new StringBuffer("Core2Web");
        
        str1.concat(str2);
        str3.append(str2);
        
        System.out.println("str1 is : "+str1);
        System.out.println("str2 is : "+str2);
        System.out.println("str3 is : "+str3);
    }
}