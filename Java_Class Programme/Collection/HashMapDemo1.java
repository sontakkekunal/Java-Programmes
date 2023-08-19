import java.util.*;
class HashMapDemo{
        public static void main(String [] args){

                HashMap <Integer,String>hm= new HashMap<Integer,String>();
                hm.put(1,"Infosys");
                hm.put(8,"Bardays");
                hm.put(5,"CarPro");
                hm.put(2,"BMC");
                System.out.println(hm);//here hash Sequence is on the key pairs

		HashMap <Integer,String>hm1= new HashMap<Integer,String>();
                hm1.put(121,"Infosys");
                hm1.put(129,"Bardays");
                hm1.put(133,"CarPro");
                hm1.put(122,"BMC");
                System.out.println(hm1);

		/*
		for(int i=0;i<200;i++){
			if(i==((new Integer(i)).hashCode()));
			else
				System.out.println(i);
		}*/
        }
}

