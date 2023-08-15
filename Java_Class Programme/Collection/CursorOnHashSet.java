import java.util.*;
class CursorOnHashSet{
	public static void main(String [] args){
		HashSet hs= new HashSet();
		hs.add("Kunal");
		hs.add("Swarup");
		hs.add("Pawar");
		hs.add("tanmay");
		hs.add("prasad");

		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		System.out.println(itr.getClass().getName());
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//ListIterator cursor =hs.listIterator();<-- ListIterator is not persent in Set
	}
}
