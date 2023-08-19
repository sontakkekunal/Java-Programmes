import java.util.*;
class MapMethods{
	public static void main(String [] args){
		HashMap hm = new HashMap();
		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");
		System.out.println("Map is: "+hm);

		System.out.println("value of key Python is: "+hm.get("Python"));//pass key and get value
		System.out.println("All keys of Map are: "+hm.keySet());//return set of keys of all map
		System.out.println("Values of all key in map is: "+hm.values());//return value of all keys
		System.out.println("Mao converted to set: "+hm.entrySet());//convert Map to set
		Set s=hm.entrySet();
	}
}
