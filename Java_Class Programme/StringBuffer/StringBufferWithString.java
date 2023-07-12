class StringBufferWithString{
    public static void main(String[] args){
        String str1="Shashi";
        String str2=new String("Bagal");
        StringBuffer str3=new StringBuffer("Core2Web");
        String str4= str3.append(str1); //--》incompatible type
        String str5= str1.append(str3); //--》cannot find symbol
        StringBuffer str6=str3.append(str1);
        
        System.out.println("str1 is : "+str1);
        System.out.println("str2 is : "+str2);
        System.out.println("str3 is : "+str3);
        System.out.println("str4 is : "+str6);
    }
}
