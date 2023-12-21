import java.util.Queue;
import java.util.LinkedList;
class QueueDemo{
	public static void main(String [] args){
		Queue<Integer> q= new LinkedList<Integer>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.add(40));
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
	}
}
