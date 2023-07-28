class MyThread extends Thread{
        MyThread(ThreadGroup tg,String str){  //constructor according to need for creating thread with valid group
                super(tg,str);  //threadGroup and thread name passing to constrcvtor  of thread class to create thread 
                                //Thread class has Contructor with parameter with ThreadGroup and String
                                //i.e Thread(ThreadGroup ,String)
        }
        public void run(){
                System.out.println(Thread.currentThread());
                System.out.println(getThreadGroup());
        }
}
class ThreadGroupDemo{
        public static void main(String [] args){
                ThreadGroup pthreadGP =new ThreadGroup("Core2Web");//Creating ThreadGroup with name as String passed parameter i.e. here 'Core2Web'

                MyThread obj1= new MyThread(pthreadGP,"C");//Creating Thread in ThreadGroup with parameter that theadGroup object and creating threadnam
                                                           //we have to mention name of creating thread along with ThreadGroup , because if it is given
                                                           //name as default(i.e. thread-0,thread-1,..)  the another ThreadGroup (main) may also contain
                                                           //defaulty named thread , so during printing stack trace it may create confusion
                MyThread obj2= new MyThread(pthreadGP,"python");
                MyThread obj3= new MyThread(pthreadGP,"Java");//Creaing mutiple thread in 'Core2Web' ThreadGroup 

                obj1.start();
                obj2.start();
                obj3.start();

		ThreadGroup cthread = new ThreadGroup(pthreadGP,"Incubator");//Child ThreadGroup created with help of parent ThreadGroup
									     //Passing Parent ThreadGroup and string as ThreadGroup name to constructor
									     //ot ThreadGroup for creation
		
		MyThread obj4=new MyThread(cthread,"Flutter");     //creating mutiple threads in child ThreadGroup and assing name to each thread 
								   //same reason as above
		MyThread obj5=new MyThread(cthread,"SpringBoot");
		MyThread obj6=new MyThread(cthread,"ReactJS");

		obj4.start();
		obj5.start();
		obj6.start();
        }
}

