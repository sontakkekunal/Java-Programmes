import java.util.*;
class HashMapDublicateKey{
	public static void main(String [] args){
		HashMap hm= new HashMap();
		hm.put("Kanha","BWC");
		hm.put("Ashish","Barchay");
		hm.put("Kanha","CarPro");//if we give dublicate key ,then the value of latest key will be updated as its keys value.
					 //key is unique
		hm.put("Rahul","BMC");
		System.out.println(hm);
	}
}

