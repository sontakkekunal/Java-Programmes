import java.util.*;
class PreDefObjSortInList{
	public static void main(String [] args){
		ArrayList al= new ArrayList();
		al.add("Kanha");
		al.add("Ashish");
		al.add("Badhe");
		al.add("Shashi");
		al.add("Rahul");

		System.out.println(al);

		Collections.sort(al);//Collections class is used for sorting the Comaparable type Object in the list
				    //it is static void sort(list) method from Collections class which sorts the list

		System.out.println(al);
	}
}
//it is used when requirement is sorted data and data dublicate is allowed
