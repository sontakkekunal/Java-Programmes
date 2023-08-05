import java.util.*;
class CollectionDemo{
	public static void main(String [] args){
		List obj = new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add(10);         //Due to generic is not mentioned here, the add() method with all parameter is present here.
		obj.add(1.5);
		obj.add(4.2f);
		obj.add(true);
		obj.add("Shashi");

		System.out.println(obj);
	}
}

//generic means specifing the specific data type for any list , it was introduced in java 1.5
//generic is used for getting similary type of data in the list
//here generic is not mentioned so we can take any kind of data here.

//after compling is gives note as below beacuse we have not mentioned the generic for the list
//but it is succefully compiled
//the generic is not mentioned so it can take any kind of data in the list

//Note: CollectionDemo.java uses unchecked or unsafe operations.
//Note: Recompile with -Xlint:unchecked for details.

//List points here
//1.Allows duplicate data
//2.Insertion order is maintained here
//i.e. (Sequence of inserting data is present)
