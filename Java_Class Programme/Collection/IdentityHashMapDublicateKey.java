import java.util.*;
class IdentityHashMapDublicateKey{
        public static void main(String [] args){
                IdentityHashMap lhm=new IdentityHashMap();
                lhm.put(10,"Kanha");
                lhm.put(10,"Rahul");
                lhm.put(10,"Badhe");
		lhm.put(new Integer(20),"Swarup");
		lhm.put(new Integer(20),"hemant");
		lhm.put(new Integer(20),"Gotya");
                System.out.println(lhm);
        }
}
//IdentityHashMap can store dublicate key
//for int as key in IdentityHashMap and HashMap ,unique key is concedered i.e. dublicate is not stored
//for new Integer as object the IdentityHashMap stores dubliate key with there value
//but HashMap don't store dubliate key

