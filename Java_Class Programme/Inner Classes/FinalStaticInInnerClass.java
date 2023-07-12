class Outer{
    int x=10;
    static int y=20;
    class Inner{
        final static int a=30;
    }
}
class FinalStaticInInnerClass{
    public static void main(String [] args){
        System.out.println(Outer.y);
        Outer obj =new Outer();
        System.out.println(obj.x);
        Outer.Inner obj1 = obj.new Inner();
        //Outer.Inner obj1 = Outer.new Inner();
        //Outer.Inner obj1 = obj.Inner();
        System.out.println(obj1.a);
    }
}