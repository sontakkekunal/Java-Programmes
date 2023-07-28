class Parent implements Runnable{
        Parent(){
                System.out.println("In Parent");
        }
        public void run(){
                System.out.println(Thread.currentThread());
                System.out.println("In run-Praent");

        }
}
class Child extends Parent{
        Child(){
                System.out.println("In child");
        }
        public void run(){
                System.out.println(Thread.currentThread());
                System.out.println("In run");
        }
}
class InhertanceInMutiThreadingThread{
        public static void main(String [] args){
                Parent obj =new Child();
                //Child obj =new Child();  <--works
                Parent obj1=new Parent();
                Thread t1= new Thread(obj);
		            Thread t2= new Thread(obj1);
		            t2.start();
		            t1.start();
                System.out.println(Thread.currentThread());
        }
}
~   
