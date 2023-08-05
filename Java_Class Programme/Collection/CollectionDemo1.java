import java.util.*;
class CollectionDemo1{
	public static void main(String [] args){
		List<Integer> obj = new ArrayList<Integer>();//generic of Integer is mentioned here
		obj.add(10);
		obj.add(20);
		obj.add(10);
		//obj.add(10.5);  <--error: incompatible types: double cannot be converted to Integer
		//obj.add("shashi");  <--error: incompatible types: String cannot be converted to Integer
		//only interger value is allowed here
		//Because due to generic of interger is mention,the add() method with paramter int is present here , rest of then are not present
		obj.add(30);
		//because the generic is mentioned here, so no Note is thrown here after compiling
		System.out.println(obj);
	}
}

