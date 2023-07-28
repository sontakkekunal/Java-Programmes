class Mythread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String [] args)throws InterruptedException{
		Mythread obj =new Mythread();
		obj.start();
		obj.yield();
		Thread.currentThread().sleep(100);
		System.out.println(Thread.currentThread().getName());
	}
}
//yield is not native method
//join(x) method with parameter is same as yield() method , but at a condition that prority of other thread must be same or greater 
//that is , parent and child must have same prority or child thread must have highter prority than parent
//yield() method is a request for prority , cannot say that request will approve or not
//yield() gives prority to child thread at one Quantum time of CPU, then after that both thread are in ready to run state and Thread schedular decides
//the prority of thread
