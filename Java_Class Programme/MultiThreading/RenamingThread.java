class Mythread extends Thread{
	public void run(){
		System.out.println("In run Mythread");
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String [] args)throws InterruptedException{
		System.out.println(Thread.currentThread());
		Mythread obj = new Mythread();
		obj.start();
		Thread.sleep(10);	//it throws InterruptedException 
		//Thread.sleep(-10);//value is not in range 0 to 10 // runtime exception : Exception in thread "main" In run Mythreadjava.lang.IllegalArgumentException: timeout value is negative

		Thread.currentThread().setName("Core2Web");//renaming main thread
							   //renamaing main thread is not good practice
							   //you can rename other thread
		System.out.println(Thread.currentThread());
	}
}
