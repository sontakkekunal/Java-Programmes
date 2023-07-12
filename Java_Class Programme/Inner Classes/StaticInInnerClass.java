class Outer{
    int x=10;
    static int y=20;
    class Inner{
        int a=30;
        static int b=40;
    }
}
class Client{
    public static void main(String [] args){
        Outer.Inner obj= new Outer().new Inner();
        System.out.println(obj.b);
    }
}