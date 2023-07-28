class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
                System.out.println("In run");
                System.out.println(Thread.currentThread());
		System.out.println(getThreadGroup());
        }
}
class ThreadGroupDemo{
	public static void main(String [] args){
		ThreadGroup tg =new ThreadGroup("RuntimeException");
		MyThread obj1= new MyThread(tg,"ArithameticException");
		MyThread obj2= new MyThread(tg,"NullPointerException");
		MyThread obj3= new MyThread(tg,"IllegalArgumentException");

		ThreadGroup tg2 = new ThreadGroup(tg,"IndexOutOfBoundException");
		MyThread obj4= new MyThread(tg2,"StringIndexOutOfBoundException");
		MyThread obj5= new MyThread(tg2,"ArrayIndexOutOfBoundException");

		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
	}
}
