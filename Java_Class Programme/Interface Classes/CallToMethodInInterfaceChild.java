interface Demo{
        static void gun(){
                System.out.println("In gun-Demo");
        }
}
class DemoChild implements Demo{
	public void gun(){
		System.out.println("In gun-DemoChild");
	}
}
class Client{
        public static void main(String [] args){
                DemoChild obj = new DemoChild();
                obj.gun();//<--  call to mehod in demochid;
	        Demo.gun();//<--  call to mehod in demo
        }
}

