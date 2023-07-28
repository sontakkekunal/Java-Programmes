import java.lang.ThreadGroup;
class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
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
		ThreadGroup pThreadGP= new ThreadGroup("India"); //parent of this threadGroup is main
								 //internaly main's threadGroup refers is passed in constructor of ThreadGroup along 
								 //with threadgroup name
		MyThread tg1 = new MyThread(pThreadGP,"Maha");
		MyThread tg2 = new MyThread(pThreadGP,"Goa");

		tg1.start();
		tg2.start();
		
		ThreadGroup cThreadGP =new ThreadGroup(pThreadGP,"Pakistan");
		MyThread tg3 = new MyThread(cThreadGP,"Karachi");
		MyThread tg4 = new MyThread(cThreadGP,"lahore");
		tg3.start();
		tg4.start();

		ThreadGroup cThreadGP2 = new ThreadGroup(pThreadGP,"Bangaldesh");
		MyThread tg5 = new MyThread(cThreadGP2,"Dhaka");
		MyThread tg6 = new MyThread(cThreadGP2,"Rangpur");

		tg5.start();
		tg6.start();

		cThreadGP.interrupt();//during runtime ,when the thread is in the sleep as mentioned in the run() method,the interrupt is generted in 
				      //that perticlar  threadGroup, so all that thread persent in that perticular threadGroup throws interruptExceptio
				      //on this pespective  Pakistan is interrupted
				      //InterruptedException is catched at runtime   

		System.out.println(pThreadGP.activeCount());  //returns the number of thread currently present under the Parent ThreadGroup
							      //it has no. of thread in itself ThreadGroup + also no. of thread in side the its child
							      //GroupThread
							      //this is on pespective of parent of pThreadGP
		System.out.println(pThreadGP.activeGroupCount());//it returns the number of child ThreadGroup under Parent ThreadGroup
								 //this is on pespective of parent of pThreadGP
		System.out.println(Thread.currentThread().getThreadGroup().activeGroupCount());//this on pespective of parent of main Thread
		System.out.println(Thread.currentThread().getThreadGroup().activeCount());//this on pespective of parent of main Thread
	}
}

