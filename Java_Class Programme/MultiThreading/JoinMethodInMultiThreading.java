class Mythread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In thread-0");
		}
	}
}
class ThreadDemo{
	public static void main(String [] args)throws InterruptedException{
		Mythread obj = new Mythread();
		obj.start();
		obj.join();  // obj has Object of newly created thread, the join() method gives priority to newly created thread and main thread wait 
			     // utill complete  excution of that thread.In that wait proccess it is in the Ready to run state
			     // After complete excution  of that thread ,then CPU goes to main thread excution
	                	// it throws InterruptedException, it must be throws or try catch handled other compiletime  error(CTE)
			    //error: unreported exception InterruptedException; must be caught or declared to be thrown
		for(int i=0;i<10;i++){
			System.out.println("In Main");
		}
	}
}
//Due to giving priority to thread-0,the the complete excution of thread-0 will occur then main thread excution will occur
