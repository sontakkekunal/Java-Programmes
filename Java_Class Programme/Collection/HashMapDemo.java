//Entry is subset of Map i.e. Map$Entry
//Map$Entry is inner interface in the Map
import java.util.*;
class HashMapDemo{
	public static void main(String [] args){
		HashSet <String>hs=new HashSet<String>();
		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		System.out.println(hs);

		HashMap <String,String>hm= new HashMap<String,String>();
		hm.put("Kanha","Infosys");
		hm.put("Ashish","Bardays");
		hm.put("Badhe","CarPro");
		hm.put("Rahul","BMC");
		System.out.println(hm);//here hash Sequence is on the key pairs
	}
}
//HashSet internally calls the HashMap function, so the output sequence of both are same
