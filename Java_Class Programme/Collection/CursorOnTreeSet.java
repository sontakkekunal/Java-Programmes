import java.util.*;
class CursorOnTreeSet{
        public static void main(String [] args){
                TreeSet ts= new TreeSet();
                ts.add("Kunal");
                ts.add("Swarup");
                ts.add("Pawar");
                ts.add("tanmay");
                ts.add("prasad");

                System.out.println(ts);

                Iterator itr=ts.iterator();
                System.out.println(itr.getClass().getName());
                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
                //ListIterator cursor =hs.listIterator();<-- ListIterator is not persent in Set
        }
}
   
