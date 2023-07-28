class Mythread extends Thread{
	public void run(){
		System.out.println("Namee is : "+Thread.currentThread().getName());
		System.out.println("Group is : "+Thread.currentThread().getThreadGroup());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		Mythread obj = new Mythread();
		//obj.start();
		obj.setName("Kunal");
		obj.start();
	}
}
