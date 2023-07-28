class MyThread extends Thread{
	public void run(){ //run() has public access specfier in Thread Class ,so mantaining the scope
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName()); 
	}
        public void start(){  //start() has public access specfier in Thread Class ,so mantaining the scope
			      //Don't Overide the start method of Thread class , because the start method of class Thread has capabaility to create 
			      //new thread and to give run() to that new thread and start that thread 
		System.out.println("In mythread start");
		run();
	}
}
class ThreadDemo{
	public static void main(String [] args){
		MyThread obj = new MyThread();
		obj.start();   //If we overide the start() method , it will make as noraml print output as normal Object & class with Single thread
		System.out.println(Thread.currentThread().getName());
	}
}
