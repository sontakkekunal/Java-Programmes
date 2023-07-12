interface A{
        int x=10;
}
interface B{
        int x=20;
}
class Child implements A,B{
        void fun(){
                System.out.println(x);
        }
}

