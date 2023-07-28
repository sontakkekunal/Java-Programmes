class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println("In Run");
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		MyThread obj= new MyThread(Thread.currentThread().getThreadGroup(),"FirstThreadInMain");
		//MyThread obj= new MyThread("FirstThreadInMain");  <--- same working , creates thread in Main ThreadGroup
		obj.start();
	}
}
