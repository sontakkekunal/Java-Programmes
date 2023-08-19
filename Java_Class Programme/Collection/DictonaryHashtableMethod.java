import java.util.*;
class DictonaryHashtableMethods{
	public static void main(String [] args){
                Hashtable ht= new Hashtable();
                ht.put(10,"Sachin");//10%11(default capacity)
                ht.put(7,"MSD");//10%11
                ht.put(8,"Virat");//8%11
                ht.put(1,"KLRahul");//1%11
                ht.put(45,"Rohit");//45%11
                System.out.println(ht);

		//Enumeration<K> keys()
		Enumeration itr1=ht.keys();//returns the all key of Hashtable to the cursor
		while(itr1.hasMoreElements()){
			System.out.println(itr1.nextElement());
		}

		//Enumeration<V> elements()
		Enumeration itr2=ht.elements();//return all values of the hashtable to the cursor
		while(itr2.hasMoreElements()){
			System.out.println(itr2.nextElement());
		}

		//V get(Object)
		System.out.println(ht.get(10));//retuns the value of that passed key
		
		//V remove(Object)
		System.out.println(ht.remove(1));//returns that passed key value and removes that entry

		System.out.println(ht);
	}
}

