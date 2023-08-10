import java.util.*;
class VectorDemo{
	public static void main(String [] args){
		ArrayList al= new ArrayList();
		al.add("kk");
		al.add(55);
		al.add("Kunal");
		Vector v= new Vector(al);//the new  Vector(Collection) object adds that collection at firts of the vector
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(30);
		v.addElement(40);
		v.addElement(40);
		v.addElement(40);
		v.addElement(40);
		v.addElement(40);
		v.addElement(40);
		v.addElement(40);  //default capacity is 10, but if capacity exceds then capacity is doubled
		System.out.println(v);
		System.out.println(v.capacity());
		v.removeElement(2);//will not remove element beacuse , element 2 is not present in vector
		v.removeElement(20);
		System.out.println(v);
		//All methods is vector have full name ,because vector class is legacy
		//in vector all method is synchronized

	}
}
