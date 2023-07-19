class MyThread extends Thread{ //MyThread has Parent Thread, so it inherits the properties of Thread 
			       //Thread has 'public void run()' method
	public void run(){// method run() is overided here,public access specfier to mantain the scope of method 

		for(int i=0;i<10;i++){       //the thread-0 thread runnes this method first when thread is started
					     //run() is  similiar method like main in thread "main"
			System.out.println("In run");
		}
	}
}
class ThreadDemo{
	public static void main(String [] args){
		MyThread obj= new MyThread();  //new thread with name 'thread-0' is created here
		obj.start();  //the newly created thread is started here
		for(int i=10;i<20;i++){
			System.out.println("In main");
		}
	}
}
//Output varies based on the prority given to perticular thread by thread scheduler
//If any thread sleep , then prority goes to the other thread

