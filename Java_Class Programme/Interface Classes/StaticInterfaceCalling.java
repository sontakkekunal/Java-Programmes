interface Demo{
        static void gun(){
                System.out.println("In gun-Demo");
        }
}
class DemoChild implements Demo{
}
class Client{
        public static void main(String [] args){
//                Demo obj =new DemoChild();
                Demo.gun();  //<---static method in interface is only accessed by class name
        }
}

