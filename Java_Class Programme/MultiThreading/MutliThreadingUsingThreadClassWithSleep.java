class MyThread extends Thread{ //MyThread has Parent Thread, so it inherits the properties of Thread 
                               //Thread has 'public void run()' method
        public void run(){// method run() is overided here,public access specfier to mantain the scope of method 
		System.out.println("run() methods runs in thread : "+Thread.currentThread().getName());//this method chaining returns threadname
                for(int i=0;i<10;i++){       //the thread-0 thread runnes this method first when thread is started
                                             //run() is  similiar method like main in thread "main"
                        System.out.println("In run");
			try{
				Thread.sleep(1000); //due to interrupt and delay it throws InterruptedException <--Comiple time Exception
			}catch(InterruptedException obj){
			}

                }
        }
}
class ThreadDemo{
        public static void main(String [] args) throws InterruptedException{//due to interrupt and delay it throws InterruptedException<-ComipletimeExce
                MyThread obj= new MyThread();  //new thread with name 'thread-0' is created here
					       //State also called as New/Born state
                obj.start();  //the newly created thread is started here
			      //start() method is of Thread class which is inherited to MyThread class
			      //the run() is called in newly creadted Thread i.e. is thread-0
			      //And then both Thread runs similantly

		System.out.println("main() methods runs in thread : "+Thread.currentThread().getName());
                for(int i=10;i<20;i++){
                        System.out.println("In main");
			Thread.sleep(1000);
                }
        }
}
//Output varies based on the prority given to perticular thread by thread scheduler
//If both  thread  has sleep , then at sequence both thread sleep and after sleep it continues indivilualy

