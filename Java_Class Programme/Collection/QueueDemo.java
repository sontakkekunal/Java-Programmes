import java.util.*;
class QueueDemo{
    public static void main(String ajj[]){
        Queue que= new LinkedList();
        que.offer(10);//adds data in the queue and queue sequence
        que.offer(20);
        que.offer(50);
        que.offer(30);
        que.offer(40);
        System.out.println(que);

        //removes first elements of queue
        que.poll();
        //que.remove();//throws NoSuchElemenException when queue is empty

        System.out.println(que);

        //returns first element of queue
        System.out.println(que.peek());
        //System.out.println(que.element());//throws NoSuchElemenException when queue is empty
        System.out.println(que);
    }
}