import java.util.*;
import java.util.concurrent.*;
class ArrayBlockingQueueDemo{
        public static void main(String [] args) throws InterruptedException{
                BlockingQueue bQueue = new LinkedBlockingQueue();
		//for LinkedBlockingQueue it is unbouneded for size i.e. can add unlimited entryes for no argumnet constructor
		//for agrumnet int constructor-> LinkedBlockingQueue(int) same as for arrayBlocingqueue
                bQueue.put(10);
                bQueue.put(20);
                bQueue.put(30);
                System.out.println(bQueue);

                bQueue.offer(40,5,TimeUnit.SECONDS);//try to add entry '40' for 5 seconds withhelp by passing time unit
                                                    //it will not add entry becuase queue is full and wait till 5 seconds for queue getting free space
                System.out.println(bQueue);
                bQueue.take();//internalyy throws InterruptedException
                             // removes firts entry (head entry)
                System.out.println(bQueue);
                bQueue.put(40);
                System.out.println(bQueue);

                ArrayList al= new ArrayList();
                System.out.println("ArrayList "+al);

                bQueue.drainTo(al);//moves entry all entry of queue to any collection
                //bQueue.drainTo(al,2);//will moves uptill given integer entryes to queue
                System.out.println("ArrayList "+ al);
                System.out.println(bQueue);//now empty queue because all entry are moved 
        }
} 
