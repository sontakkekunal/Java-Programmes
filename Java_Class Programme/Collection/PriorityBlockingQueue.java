import java.util.*;
import java.util.concurrent.*;
class Employee{
	int num =0;
	String name;
	Employee(int num, String name){
		this.num=num;
		this.name=name;
	}
	public String toString(){
		return "{"+num+","+name+"}";
	}
}
class SortByNum implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((Employee)obj1).num-((Employee)obj2).num;
	}
}

class ArrayBlockingQueueDemo{
        public static void main(String [] args) throws InterruptedException{
                BlockingQueue bQueue = new PriorityBlockingQueue(3);
                bQueue.put(10);
                bQueue.put(50);
                bQueue.put(30);
                System.out.println(bQueue);

                bQueue.offer(40,5,TimeUnit.SECONDS);//can also adds the entry after exciding its instiall bounded size ,how ? (hint : capacity)
		System.out.println(bQueue);
		bQueue.put(45);
		System.out.println(bQueue);//it uses internal sorting for sorting entry in queue , which/what type of sorting?
		
		BlockingQueue bQueue1 = new PriorityBlockingQueue(3,new SortByNum());
                bQueue1.put(new Employee(10,"A"));
                bQueue1.put(new Employee(50,"B"));
                bQueue1.put(new Employee(30,"C"));
                bQueue1.offer(new Employee(40,"D"),5,TimeUnit.SECONDS);
                bQueue1.put(new Employee(45,"E"));

		System.out.println(bQueue1);
		
			
	}
} 
