class Mythread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
        task();
    }
    void task(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ie){
        }
        System.out.println(getName());
    }
}
class MutliThreadingDivision{
    public static void main(String [] args)throws InterruptedException{
    Mythread obj1= new Mythread();
    obj1.start();
    Thread.sleep(1000);
    Mythread obj2= new Mythread();
    obj2.start();
    obj1.setName("First Thread");
    obj2.setName("Second Thread");   
    }
}
