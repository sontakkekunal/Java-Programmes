class StringBufferDemo1{
    public static void main(String [] args){
        StringBuffer str=new StringBuffer("Shashi");
        System.out.println(str);
        System.out.println("Identitiy hash code of "+str+" is : "+System.identityHashCode(str)+"\nhash code of "+str+" is : "+str.hashCode());
        str.append("Bagal");
        System.out.println("After appending in same StringBuffer, result is  : "+str);
         System.out.println("Identitiy hash code of "+str+" is : "+System.identityHashCode(str)+"\nhash code of "+str+" is : "+str.hashCode());
    }
}
