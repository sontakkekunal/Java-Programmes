import java.util.*;
class NavigableSetMethod{
	public static void main(String [] args){
		NavigableSet<Integer> ns= new TreeSet<Integer>();
		ns.add(10);
		ns.add(30);
		ns.add(14);
		ns.add(27);
		ns.add(23);
		System.out.println(ns);
		//As it is child of sortedset the the entry will be sorted and stored

		//E lower(E)
		System.out.println(ns.lower(23));//strictly less than passed entry
		System.out.println(ns.lower(25));//return less to the passed value
		System.out.println(ns.lower(9));//no entry lesser than the passed value

		//E floor(E)
		System.out.println(ns.floor(23));//less than or equals

		//E ceiling(E)
		System.out.println(ns.ceiling(23));
		System.out.println(ns.ceiling(25));//greater than or equals

		//E higher(E)
		System.out.println(ns.higher(25));//striclty higher
		
		//E pollFirst()
		System.out.println(ns.pollFirst());//returns first entry and removes it form set

		ns.add(10);
		//E pollast()
		System.out.println(ns.pollLast());//returns last entry and removes it from set
		
		ns.add(30);
		//Iterator<E> iteroter
		Iterator itr=ns.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		//NavigableSet<E> desendingSet();
		System.out.println(ns.descendingSet());//return reversed set

		//Iterator<E> desendingIterator
		Iterator itr1= ns.descendingIterator();//reverse iterator
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}

		//NavigableSet<E> subSet(E,boolean,E,boolean)\
		System.out.println(ns.subSet(10,true,27,false));//while set returning it include true value(10) elemnts
							    //and till return till another pased elemnts and not include false value(27) elemnts

		System.out.println(ns.headSet(23,false));		
		System.out.println(ns.tailSet(14,true)+"t");
		System.out.println(ns.subSet(14,27));
		System.out.println(ns.headSet(23));
		System.out.println(ns.tailSet(14)+"t");
		}
}
