import java.lang.ThreadGroup;
class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo{
	public static void main(String [] args){
		ThreadGroup pThreadGP = new ThreadGroup("India");
		MyThread obj = new MyThread();
		Thread t1 = new Thread(pThreadGP,obj,"Maha");
		Thread t2 = new Thread(pThreadGP,obj,"Goa");

		t1.start();
		t2.start();

		ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");
		Thread t3 = new Thread(cThreadGP,obj,"Lohore");
		Thread t4 = new Thread(cThreadGP,obj,"Karachi");

		t3.start();
		t4.start();
	}
}
