interface Demo{
        void gun();
        default void fun(){  //public 
                System.out.println("In fun Demo");
        }       
}       
class DemoChild implements Demo{
        public void gun(){
                System.out.println("In gun Demo");
	}
        public void fun(){
		System.out.println("In fun Demo");
	}
}       
class Client{
        public static void main(String [] args){
                Demo obj = new DemoChild();
                obj.fun();
                obj.gun();
        }       
}       

~       
