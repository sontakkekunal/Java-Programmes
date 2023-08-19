import java.util.*;
class LinkedHashMapDemo{
	public static void main(String [] args){
		//Cursor don't work on any Map If you want to use then convert map to set by method map
		LinkedHashMap lhm= new LinkedHashMap();
		lhm.put("Badhe","Infoysos");
		lhm.put("Kanha","Burclays"); 
		lhm.put("Ashish","CarPro");
		lhm.put("Rahul","BMC");
		System.out.println(lhm);//insertion order is maintained while storing and printing
	}
}
