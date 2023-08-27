
class ThreadDemo{
	public static void main(String [] args){
		Runnable obj1=new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
		}
		};
		Runnable obj2=new Runnable(){
                	public void run(){
                        	System.out.println(Thread.currentThread().getName());
                	}
        	};//giving body to run method by annyomus class as making child
	 
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
	
		t1.start();
		t2.start();

		Runnable obj3=()->{
			System.out.println(Thread.currentThread().getName());
		};//gives body to refernce of method to run method(using lambda function, not creating extra class)
		Thread t3= new Thread(obj3);
		t3.start();
	}
}



