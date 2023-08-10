import java.util.LinkedList;
//why index works in the linkedlist
//->Because LinkedList is child of list, interface the list supports index and so linkedkist support the index
//
//Linkedlist gives dynamically memory in heap(i.e. no sequenctaly memory is given)
//node can be stored at any addess of the Linkedlist
class LinkedListDemo{
	public static void main(String [] args){
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(10);
		ll.addFirst(20);
		ll.add(30);
		ll.addLast(40);
		ll.add(50);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);
		System.out.println(ll.contains(30));
		System.out.println(ll.get(0));
		System.out.println(ll.set(0,69));
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);

	}
}

