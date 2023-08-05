import java.util.*;
class ArrayListDemo1 extends ArrayList{
        public static void main(String [] args){
                ArrayListDemo1 al = new ArrayListDemo1();
                al.add(10);
                al.add(20);
                al.add(20);
                al.add(20.5f);
                al.add(20.5d);
                //public void add(element)
                al.add("Shashi");// add() method adds object last of the list
		al.add(45);
		al.add("Kunal");
		al.add("07");


		//protected void removeRange(int,int) <-- remove object in list in given range
		//the method is protected so the access it ,our class must be child of that class
		//after inhertiance this method from parent, it must be accessed form its child object
		//as it extends ArrayList , class ArrayListDemo1 has all methods ArrayList 
		System.out.println("Before: "+al);
		al.removeRange(2,5);// last index is left just like string methods
		System.out.println("After using removeRange(int,int) method: "+al);
	}
}
