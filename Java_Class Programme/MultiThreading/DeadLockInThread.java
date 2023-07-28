class Mythread extends Thread{
	static Thread nmMain=null;//the variable is null instaily
				  //in Runtime or excution the line in main gives access it and assin the object of main thread in it 
        public void run(){
		try{
			nmMain.join();  //when thread-0 is started the nmMain vairble has main thread address,the join method gives priority to main 
					//thread and wait in ready to run state utill complete exceution of main thread
		}catch(InterruptedException ie){
		}
                for(int i=0;i<10;i++){
                        System.out.println("In thread-0");
                }
        }
}

//here, join() method in both thread gives priority to each other thread and wait in ready to run state  utill complete exceution of other thread
//they are recursion in each other,i.e. it is in DeadLock
class ThreadDemo{
        public static void main(String [] args)throws InterruptedException{
		Mythread.nmMain=Thread.currentThread();  //access static(comman) vaiable by class name and giving current thread object in it .i.e. is 
							 //main thread object in the  static variable of Mythread class
                Mythread obj = new Mythread();
                obj.start();
                obj.join();  // obj has Object of newly created thread, the join() method gives priority to newly created thread and main thread wait in
			     // ready to run state utill complete exceution of thread-0
                                // it throws InterruptedException, it must be throws or try catch handled other compiletime  error(CTE)
                            //error: unreported exception InterruptedException; must be caught or declared to be thrown
                for(int i=0;i<10;i++){
                        System.out.println("In Main");
                }
        }
}
//no output ,no responce due to deadlock
