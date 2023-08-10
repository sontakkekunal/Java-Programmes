import java.util.*;
class HashSetDemoObj{
	public static void main(String [] args){
		HashSet hs = new HashSet();
		hs.add(10); //.add(new Integer(10)) --> internal
			    //in collection every thing we add is a object , not a primivtive data type
		hs.add(20);
		hs.add(new Integer(10));
		hs.add(new Integer(20));
	}
}//so it add the firts 10 and 20 , not second because they are dublicate
