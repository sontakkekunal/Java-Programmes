import java.util.*;
class ListInterator{
	public static void main(String [] args){
		LinkedList ll= new LinkedList();
		ll.add("V");
		ll.add(45);
		ll.add(7);
		ll.add("Y");
		ll.add("C2W");
		

		ListIterator cursor=ll.listIterator();//here iterator() method form inner class LinkedList$ListItr is called beacuse LinkedList is used
						
		System.out.println(cursor.getClass().getName());//cursor return type will be LinkedList$ListItr 
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		//at this line the cursor is at the last object of list
		while(cursor.hasPrevious()){
			System.out.println(cursor.previous());
			//System.out.println(ll.next())  <--Exception
		}//here the first object should not print but it prints, beasuse java had fixizsation something
		//hasPrevious() and previous() method is only persent in ListInterator
		//and ListInterator cursr only works on vector
		
		//the hasPrevious() checks the previous object is present or not
		//the previous() method first prints the current object , then moves its cursor to previous object 

	}
}
