class Mythread extends Thread{
        public void run(){
                for(int i=0;i<200;i++){
                        System.out.println("In thread-0");
                }
        }
}
class ThreadDemo{
        public static void main(String [] args)throws InterruptedException{
                Mythread obj = new Mythread();
                obj.start();
		//parameted join() method
                obj.join(1);  // obj has Object of newly created thread, the join() method gives priority to newly created thread and main thread wait 
      //obj.join(int)<-internal // utill given paramter ms(i.e. it has integer paramter),i.e. 1ms .In that wait proccess it is in the Ready to run state
                             // After 1ms excution  of that thread ,then CPU goes to main thread excution
                                // it throws InterruptedException, it must be throws or try catch handled other compiletime  error(CTE)
                            //error: unreported exception InterruptedException; must be caught or declared to be thrown
                for(int i=0;i<10;i++){
                        System.out.println("In Main");
                }
        }
}
//Due to giving priority to thread-0 for 1ms ,the excution of thread-0 will occur for 1ms  then Thread Shedular decides the priority to thread

