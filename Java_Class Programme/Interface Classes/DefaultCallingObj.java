interface Demo{
        default void gun(){
                System.out.println("In gun-Demo");
        }
}
class DemoChild implements Demo{
	public void gun(){
		System.out.println("In fun-DemoChild");
	}
}


class Client{
        public static void main(String [] args){
                Demo obj =new DemoChild();
                obj.gun();
        }
}

