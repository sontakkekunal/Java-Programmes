import java.util.*;
//insertion order is maintained
//was added in java 1.4
class LinkedListDemo{
	public static void main(String [] args){
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("Kanha");
		lhs.add("Rahul");
		lhs.add("Ashish");
		lhs.add("Badhe");
		lhs.add("Ashish");//not maintained
		lhs.add("Rahul");///not maintained
		System.out.println(lhs);//will print in inserated order
	}
}
//[Kanha, Rahul, Ashish, Badhe]
