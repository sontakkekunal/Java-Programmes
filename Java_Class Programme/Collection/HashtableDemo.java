//Dictonary abstract class has parent Object class
//Hashtable has parent Dictonary  and implements Map iterface

//Hashtable is sycrinised, so it works slower than hashmap
//Sorting of keys of hashtable and hashmap and hashset is same
import java.util.*;
class HashtableDemo{
	public static void main(String [] args){
		Hashtable ht= new Hashtable();
		ht.put(10,"Sachin");//10%11(default capacity)
		ht.put(7,"MSD");//10%11
		ht.put(8,"Virat");//8%11
		ht.put(1,"KLRahul");//1%11
		ht.put(45,"Rohit");//45%11
		System.out.println(ht);
	}
}
