import java.util.PriorityQueue;
//internally uses heap data structure for sorting
class ProrityQueueStringDemo{
    public static void main(String [] args){
        PriorityQueue pq= new PriorityQueue();
        pq.offer("Kanha");
        pq.offer("Ashsih");
        pq.offer("Rahul");
        pq.offer("Rajesh");
        pq.offer("Badhe");
        System.out.println(pq);
    }
    
}

