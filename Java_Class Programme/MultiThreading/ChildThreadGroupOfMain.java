class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread());

	}
}
class ThreadGroupDemo{
	public static void main(String [] jij){
		ThreadGroup tg= Thread.currentThread().getThreadGroup();
		ThreadGroup ctg= new ThreadGroup(tg,"ChildThreadGroupOfThreadGroupmain");
		MyThread obj1=new MyThread(ctg,"1st thread");
		MyThread obj2=new MyThread(ctg,"2st thread");
		obj1.start();
		obj2.start();
		System.out.println(Thread.currentThread());

	}
}
