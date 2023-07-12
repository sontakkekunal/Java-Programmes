class StringBufferDemo2{
    public static void main(String [] args){
        StringBuffer str=new StringBuffer("Shashi");
        System.out.println(str.capacity());//6+16
        StringBuffer str1 =new StringBuffer("Suraj");
        System.out.println(str1.capacity());//5+16
    }
}