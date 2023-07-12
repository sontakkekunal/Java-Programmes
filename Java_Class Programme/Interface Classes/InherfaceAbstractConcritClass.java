interface Demo{
        void fun();
        void gun();
}
abstract class ChildDemo implements Demo{
	public void gun(){
                System.out.println("In gun");
        }
}

class ChildDemo1 extends  ChildDemo{
        public void fun(){  
                System.out.println("In fun");
        }
}
class Client{
        public static void main(String [] args){
                Demo obj = new ChildDemo1();  //<--Inherface refernce and child of inherface cha object
                obj.fun();
                obj.gun();
        }
}

