//Runnabel is parent of Mythread
//Runnabel interface has only one method 
//i.e. public abstract void run()
class Mythread implements Runnable{ //type Runnable 
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		Mythread obj = new Mythread();  
		Thread t = new Thread(obj); //here,new thread created with target to Mythread class
	                               	// Object of Mythread class is passed to parametried construtor of Thread class by making object of Thread
					     // class ,that parametried construtor has parameter Runnable
					     // i.e. ---> Thread(Runnable obj)
					     // internal  ---> Runnable obj=obj <-- Object of Mythread
					     //   Runnable refrence for object of Mythread works beacuse Runnable is parent of Mythread
		t.start();     //newly created thread starts here
		System.out.println(Thread.currentThread().getName());
	}
}
