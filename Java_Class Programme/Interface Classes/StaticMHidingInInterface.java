interface Demo1{
        static void gun(){
                System.out.println("In gun-Demo1");
        }
}
interface Demo2{
        static void gun(){
                System.out.println("In gun-Demo2");
        }
}
/*
class DemoChild implements Demo1,Demo2{   //<-- static method does not inhertes in interface ,so error cannot find symbol
}
*/
class DemoChild implements Demo1,Demo2{
	void gun(){
		System.out.println("In fun-Child");
		Demo1.gun();
		Demo2.gun();
	}
}
class Client{
        public static void main(String [] args){
                DemoChild obj =new DemoChild();
                obj.gun();
        }
}

