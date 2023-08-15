import java.util.*;
class SortedSetInterfaceDemo{
	public static void main(String [] args){
		SortedSet ss= new TreeSet();
		ss.add("Kanha");
		ss.add("Rajesh");
		ss.add("Rahul");
		ss.add("Ashish");
		ss.add("Badhe");

		System.out.println(ss);//print sorted set
		//following method output will be after sorting the element
		System.out.println(ss.headSet("Kanha"));//prints element from start till the before Kanha elements
		System.out.println(ss.tailSet("Kanha"));//prints element from Kanha uptill end elements
		System.out.println(ss.subSet("Ashish","Rahul"));//print from ashish elements till  before of Rahul element
		System.out.println(ss.first());//print first element
		System.out.println(ss.last());//print last element 
		System.out.println(ss);

	}
}
