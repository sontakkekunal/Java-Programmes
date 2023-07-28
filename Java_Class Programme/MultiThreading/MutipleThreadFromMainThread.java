class Demo extends Thread{
	public void run(){
		System.out.println("Demo: "+Thread.currentThread().getName());
	}
}
class MyThread extends Thread{
	public void run(){
		System.out.println("MyThread: "+Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		System.out.println("ThreadDemo: "+Thread.currentThread().getName());

		MyThread obj1= new MyThread();
		obj1.start();

		Demo obj2 = new Demo();
	        obj2.start();
	}
}


