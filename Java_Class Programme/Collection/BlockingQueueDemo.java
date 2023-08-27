import java.util.concurrent.*;
class BlockingQueueDemo{
	public static void main(String [] arfs)throws InterruptedException{
		BlockingQueue bQueue = new ArrayBlockingQueue(3);//has constructor with int parameter for setting size queue
								 //don't have no arugumnet constructor(default constructor)
								 //because array is bounded with size

		//only uptill given sizes will be added entrys
		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);
		//bQueue.offer(40);//will not able to add entry due to given size

		System.out.println(bQueue);

		bQueue.put(40);//throws IterruptedException internally (CTE)
			       //blocked here , beacuse it wait untill queue gets empty
		System.out.println(bQueue);





	}
}
