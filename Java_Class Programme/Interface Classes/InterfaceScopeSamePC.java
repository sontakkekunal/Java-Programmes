interface Demo{
        void fun();
        void gun();
}
class ChildDemo implements Demo{
        public void fun(){  
                System.out.println("In fun");
        }
        public void gun(){  
                System.out.println("In gun");
        }
}
class Client{
	public static void main(String [] args){
		Demo obj = new ChildDemo();  //<--Inherface refernce and child of inherface cha object
		obj.fun();
		obj.gun();
	}
}
