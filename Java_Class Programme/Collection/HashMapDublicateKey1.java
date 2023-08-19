import java.util.*;
class HashMapDublicate{
	public static void main(String [] args){
		HashMap hm=new HashMap();
		hm.put(10,"Kanha");
		hm.put(10,"Rahul");
		hm.put(10,"Badhe");
		hm.put(new Integer(20),"Pawar");
                hm.put(new Integer(20),"Swarup");
                hm.put(new Integer(20),"Tejas");
		System.out.println(hm);
	}
}
