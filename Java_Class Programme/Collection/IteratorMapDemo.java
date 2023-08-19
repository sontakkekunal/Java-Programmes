import java.util.*;
class IteratorMapDemo{
	public static void main(String [] args){
                SortedMap sm= new TreeMap();
                sm.put("Ind","India");
                sm.put("Pak","Pakistan");
                sm.put("SL","SriLanka");
                sm.put("Aus","Australia");
                sm.put("Ban","Bangaladesh");
		System.out.println(sm);
		//Iterator only works on the collection, so we convert map to Set by entrySet() method
		//set is child of collection 
		Set<Map.Entry> data=sm.entrySet(); //giving specific type entry in the set by using<Map.Entry>
						   //<Map.Entry> is not a generic
						   //Entry is inner iterface of the Map
						   //The actually entrySet() returns the TreeMap$EntrySet type set to the data
						   //And the data type of specific entry is TreeMap$Entry 
		var arr=data.toArray()[0];
		System.out.println(arr.getClass().getName());
		System.out.println(data.getClass().getName());
		Iterator<Map.Entry> itr=data.iterator();//using iterator on the set by type of <Map.Entry>

		while(itr.hasNext()){
			Map.Entry abc=itr.next();//converting perticular entry back to Map for using getValue and getKey methods
			System.out.println(abc.getKey()+":"+abc.getValue());
		}
	}
}
