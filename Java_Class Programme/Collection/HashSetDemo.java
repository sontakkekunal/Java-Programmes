import java.util.*;
//*Set
//In set dubilcate data is not allowed
//Inseration is maintained is some child of it and not some other child

//*HashSet 1.2
//was added in a java //HashSet is internally a HashMap
//key is unique , so the dubilcate is not allowed
//in hashset insertion order is not maintained
class HashSetDemo{
	public static void main(String [] args){
		HashSet hs= new HashSet();
		hs.add("Kanha");
		hs.add("Rahul");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		hs.add("Ashish");
		System.out.println(hs.add("Ashish"));//add() methods return true if object is added in the set
						     //here it will return false beacuse the ashish is already stored first
		System.out.println(hs);//in hashset the data stored by calulation of hashfunction i.e. the sequence is decided by calulation of hashfunction
				       //output sequence cannot be predicted
	}
}
//output:- [Rahul, Ashish, Badhe, Kanha]
//inseration order is not maintained
