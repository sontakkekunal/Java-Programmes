import java.util.*;
//the object are sorted in the treeset while storeing
//it don't matter in which sequece we add a data
class TreeSetDemo{
	public static void main(String [] args){
		TreeSet ts=new TreeSet();
		ts.add("Kanha"); //.add(new String("Kanha"))-->same output
				 //beacuse in collection everything we add is a object
		ts.add("Ashish");
		ts.add("Rahul");
		ts.add("Badhe");
		System.out.println(ts);
		System.out.println(ts);
		//String class object object are comparable within its object
		//Because String implements comparable iterface 
		//simiilay is raper class like Integer
		//
		//the class which implement comparable iterface are of comparable type
	}
}
