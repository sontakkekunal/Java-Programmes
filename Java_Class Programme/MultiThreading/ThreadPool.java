import java.util.concurrent.*;
class Mythread extends Thread{
	int num=0;
	Mythread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println(Thread.currentThread()+" Start Thread "+num);
		dailyTask();
		System.out.println(Thread.currentThread()+" End Thread"+num);
	}
	void dailyTask(){
		try{
			Thread.sleep(20000);
		}catch(InterruptedException ie){
		}
	}
}
class ThreadPoolDemo{
	public static void main(String [] arhs){
		//All method is Executors is static
		//Executors class is used for creating created pool
		//ThreadPoolExceutor class is used for managing thread to task 
		
		ExecutorService ser = Executors.newFixedThreadPool(3);  //Creates the no. of thread that user has passed integer number
									// static ExecutorService newFixedThreadPool(int )
									// each n created thread handles task consecutenly
									// here there is  6 task,so first 3 thread handles 3 task , then after complitio
									// of task , same 3 thread handled next 3 task
									// return type of this method is ExecutorService 
		
		/*
		ExecutorService ser = Executors.newCachedThreadPool();  //Created the no. thread that no. of task have 
									//i.e. no. of thread = no. of task
									//here there is 6 task, so 6 thread created in threadpool ,at atime 6 thread 
									//perform 6 tasks
									// static ExecutorService newCachedThreadPoll() 
									//return type of this method is ExecutorService
		*/
		/*
		ExecutorService ser = Executors.newSingleThreadExecutor();
		//ThreadPoolExecutor ser = (ThreadPoolExecutor)Executors.newSingleThreadExecutor();   //Creates single thread ,for n task
											     // return type of this method is ExecutorService
											     // we have type cast it into its childs class
											     // using most child class is benefial beasuse it has all
											     // method of itself as well as its parent
											     // static ExecutorService newSingleThreadExecutor() 
		*/
		for(int i=1;i<=6;i++){
			Mythread obj = new Mythread(i);
			ser.execute(obj);   //public abstract void execute(Runnanle) in side Executor interface
					    //obj is object of Mythread is of runnable type because parent of Mythread is Runnable
		}
		ser.shutdown();  //after exceution of all task ,the threadpool is still in alive state, i.e. is threads in threadpool is readytorun stat
				 //shutdown() method terminates the threadpool
		}
}
