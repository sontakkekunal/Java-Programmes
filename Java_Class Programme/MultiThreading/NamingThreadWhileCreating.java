class MyThread extends Thread{
	//if we don't write needed parametred constructor then error is 
	//error: constructor MyThread in class MyThread cannot be applied to given types;
//		MyThread obj = new MyThread("XYZ");
//		               ^
 //		 required: no arguments
// 		 found: String
// 		 reason: actual and formal argument lists differ in length
//			1 error
	MyThread(String str){
		super(str);//passing that string to parent constructor for naming that newly created thread,i.e. Thread class has property to create 
			   //thread with user define name
			   //Thread class has String parametiesd constructor
			   //if we don't write super with string argument passing to it ,then thread will not be named as userdefine while creating 
	}
	public void run(){
		System.out.println("in run");
		System.out.println(getName());//access the name of current running thread on it
		System.out.println(Thread.currentThread().getThreadGroup());//gets ThreadGroup name , for here it is main thread
	}
}
class ThreadGroupDemo{
	public static void main(String [] args){
		MyThread obj = new MyThread("XYZ");//passing String in constructor for dirtly naming that String to newly creadted thread
						   //i.e. name for new created thread
		obj.start();
	}
}
