import java.util.*;
class DequeMethods {
    public static void main(String [] args){
        Deque obj = new ArrayDeque();
        obj.offer(10);
        obj.offer(40);
        obj.offer(20);
        obj.offer(30);
        
        System.out.println(obj);//insersion order maintain 

        //offerFirst();
        obj.offerFirst(5);//adds element at first

        //offerLast();
        obj.offerLast(50);//adds elemnets at last

        System.out.println(obj);

        obj.pollFirst();//removes first element 
        obj.pollLast();//removes last element

        System.out.println(obj);

        //iterator()
        Iterator itr= obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //decendingIterator
        Iterator itr2=  obj.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }


    }
    
}
