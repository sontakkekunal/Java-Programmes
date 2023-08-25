class Mythread extends Thread{
    public void run(){
        System.out.println(getName());
        System.out.println(getPriority());
    }
}
class MultiThreadingdivision1 {
    public static void main(String [] args)throws InterruptedException{
    Mythread obj1= new Mythread();
    obj1.start();
    Mythread obj2= new Mythread();
    obj2.start();
    Thread.sleep(200);
    obj1.setName("First Thread");
    obj2.setName("Second thread");
    System.out.println(obj1.getName());
    System.out.println(obj2.getName());
    }
}
