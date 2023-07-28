import java.lang.ThreadGroup;
class ThreadiNew extends Thread{
	ThreadiNew(String str){
		super(str);
	}
	ThreadiNew(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemi{
	public static void main(String [] args){
		ThreadiNew obj = new ThreadiNew("Thread");
		obj.start();

		ThreadGroup tg1 = new ThreadGroup("XYZ");
		ThreadiNew obj1= new ThreadiNew(tg1,"Thread1");
		ThreadGroup tg2= new ThreadGroup("PQR");
		ThreadiNew obj2= new ThreadiNew(tg2,"Thread2");
		ThreadGroup tg3 = new ThreadGroup("XYZ");
		ThreadiNew obj3= new ThreadiNew(tg3,"Thread3-newTG");

		obj1.start();
		obj2.start();
		obj3.start();
	}
}
