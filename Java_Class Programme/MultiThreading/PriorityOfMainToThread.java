class Mythread extends Thread{
	public void run(){
		Thread t= Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getPriority()); 
	}
}
class ThreadDemo{
	//main has Default priority if priority is not setted
	public static void main(String [] args){
		Thread t= Thread.currentThread(); //this method return object of Thread class
                System.out.println(t);  //prints object of Thread class as (Priority of thread + thread name +thread group name)
                System.out.println(t.getPriority());  //this method called on object returns only Priority of that thread
						      
 		//Whenever we create any child thread from its parents thread ,the priority of the parent is also allocated to priority of child thread


		Mythread obj1 =new Mythread();
		obj1.start();  //created thread 'Threat-0' started with priority same as main thread priority i.e. 5
		
		t.setPriority(7);//Setting priority of main to 7 

		Mythread obj2 =new Mythread();
                obj2.start(); //created thread 'Threat-1' started with priority same as main thread priority i.e. 7
		
//		obj1.start();//(exception) cannot go to its previous state
			     //java.lang.IllegalThreadStateException
				//	at java.base/java.lang.Thread.start(Thread.java:1534)
				//	at ThreadDemo.main(PriorityOfMainToThread.java:26)

	}
}
//Prority Range( 1 to 10)
//Prority type:--
//1.MIN_PRIORITY = 1
//public static final int MIN_PRIORITY;
//
//2.NORM_PRIORITY =5 <--Default priority
// public static final int NORM_PRIORITY;
//
//3.MIN_PRIORITY=10 
// public static final int MAX_PRIORITY;
