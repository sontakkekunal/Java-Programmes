import java.util.concurrent.*;
class MyThread extends Thread{
	public void run(){
		System.out.println("Run started");
		task();
		System.out.println("Run ended");
	}
	synchronized void task(){
		System.out.println("Task started");
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(10000);
		}catch(InterruptedException ie){
		}
		System.out.println("task ended");
	}

}
class Client{
	public static void main(String [] args){
		MyThread obj = new MyThread();
		ExecutorService ser=  Executors.newCachedThreadPool();
		for(int i=0;i<3;i++){
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
