import java.util.concurrent.*;
class Producer implements Runnable{
	BlockingQueue bQueue=null;
	Producer(BlockingQueue bQueue){
		this.bQueue=bQueue;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				bQueue.put(i);
				System.out.println("Produced: "+i);
				Thread.sleep(1000);
			}catch(InterruptedException ie){
			}
		}
	}
}
class Consumer implements Runnable{
	BlockingQueue bQueue=null;
	Consumer(BlockingQueue bQueue){
		this.bQueue=bQueue;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				bQueue.take();
				System.out.println("Consumer: "+i);
				Thread.sleep(7000);
			}catch(InterruptedException ie){
			}
		}
	}
}
class ProducerConsumerProblem{
	public static void main(String [] args){
		BlockingQueue bQueue = new ArrayBlockingQueue(3);
		Producer produce = new Producer(bQueue);
		Consumer consume = new Consumer(bQueue);
		Thread produceThread =new Thread(produce);
		Thread consumerThread = new Thread(consume);

		produceThread.start();
		consumerThread.start();
	}
}
