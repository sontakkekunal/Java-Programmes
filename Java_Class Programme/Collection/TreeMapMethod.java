import java.util.*;
class TreeMapMethod{
	public static void main(String [] args){
		SortedMap sm= new TreeMap();
		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("SL","SriLanka");
		sm.put("Aus","Australia");
		sm.put("Ban","Bangaladesh");
		System.out.println(sm);
		//as it is a sorted map childs , first it will sort the entryes by its keys
		//then on sorted entryes the following method is applied

		//SortedMap<K,V> subMap(K,K)
		System.out.println(sm.subMap("Aus","Pak"));//prints key and value from Aus to one entry before Pak
		
		//SortedMap<K,V> headMap(K)
		System.out.println(sm.headMap("Pak"));//prints till before Pak <k,V>
		
		//SortedMap<K,V> tailMap(K)
		System.out.println(sm.tailMap("Pak"));//prints from Pak till end<K,V>

		//K firstKey()
		System.out.println(sm.firstKey());//returns firts entry

		//K lastKey()
		System.out.println(sm.lastKey());//returns last entry

		//Set keySet()
		System.out.println(sm.keySet());//return the set of all keys

		//Set values()
		System.out.println(sm.values());//returns values of all keys

		//Set entrySet()
		System.out.println(sm.entrySet());//returns set 

	}
}
